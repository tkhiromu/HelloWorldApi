package com.example.HelloWorldApi

import kotlinx.serialization.Serializable

@Serializable
class HelloWorldRequest private constructor(
    val name: String
)
