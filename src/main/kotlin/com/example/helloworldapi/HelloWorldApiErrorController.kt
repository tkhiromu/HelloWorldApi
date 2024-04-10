//package com.example.helloworldapi
//
//import jakarta.servlet.http.HttpServletRequest
//import org.springframework.boot.web.servlet.error.ErrorController
//import org.springframework.http.HttpStatus
//import org.springframework.http.ResponseEntity
//import org.springframework.web.bind.annotation.RequestMapping
//import org.springframework.web.bind.annotation.RestController

/**
 * この実装でも良いが、ExceptionHandlerAdviceに実装まとめられる
 *
 */
//@RestController
//class HelloWorldApiErrorController: ErrorController {
//    @RequestMapping("/error")
//    fun handleError(request: HttpServletRequest): ResponseEntity<Map<String, String>> {
//        val body = mapOf(
//            "reason" to "no handler found",
//            "status" to "404"
//        )
//        return ResponseEntity(body, HttpStatus.NOT_FOUND)
//    }
//
//}
