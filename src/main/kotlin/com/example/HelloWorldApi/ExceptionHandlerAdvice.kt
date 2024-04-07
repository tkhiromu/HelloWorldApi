package com.example.HelloWorldApi

import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.http.ResponseEntity

@RestControllerAdvice
class ExceptionHandlerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun handleValidationExceptions(ex: MethodArgumentNotValidException): ResponseEntity<Map<String, Any>> {
        val errors = ex.bindingResult.fieldErrors.map {
            "${it.field}: ${it.defaultMessage}"
        }

        val responseBody = mapOf(
            "reason" to "invalid parameter",
            "detail" to errors
        )

        return ResponseEntity.badRequest().body(responseBody)
    }
}
