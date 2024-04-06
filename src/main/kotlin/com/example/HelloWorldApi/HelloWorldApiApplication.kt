package com.example.HelloWorldApi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloWorldApiApplication

fun main(args: Array<String>) {
	runApplication<HelloWorldApiApplication>(*args)
}
