package com.example.helloworldapi

import jakarta.validation.Valid
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping("/hello")
    fun hello(@Valid @RequestBody request: HelloWorldRequest): HelloWorldResponse {
        logger.debug("Received name: ${request.name}")
        return HelloWorldResponse.responseOf(request)
    }

    companion object {
        private val logger = LoggerFactory.getLogger(HelloWorldController::class.java)
    }
}
