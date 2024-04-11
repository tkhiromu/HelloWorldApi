package com.example.helloworldapi

import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController(@Autowired private val appProperties: AppProperties) {

    @GetMapping("/hello")
    fun hello(@Valid @RequestBody request: HelloWorldRequest): HelloWorldResponse {
        return HelloWorldResponse.responseOf(request, appProperties.text)
    }
}
