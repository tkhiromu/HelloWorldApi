package com.example.HelloWorldApi

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping("/hello")
    fun hello(@RequestBody request: HelloWorldRequest): String {
        return Json.encodeToString(HelloWorldResponse.responseOf(request))
    }
}
