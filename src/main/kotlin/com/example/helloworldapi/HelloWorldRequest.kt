package com.example.helloworldapi

import jakarta.validation.constraints.Size
import kotlinx.serialization.Serializable

@Serializable
class HelloWorldRequest private constructor(
    @field:Size(min = 3, max = 10, message = "nameは3文字以上10文字以内である必要があります")
    val name: String
)
