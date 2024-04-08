package com.example.helloworldapi

import kotlinx.serialization.Serializable

@Serializable
class HelloWorldRequest private constructor(
    val name: String
)
