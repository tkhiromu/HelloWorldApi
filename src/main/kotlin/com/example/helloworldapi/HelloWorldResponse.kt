package com.example.helloworldapi

import kotlinx.serialization.Serializable

@Serializable
class HelloWorldResponse private constructor(
    val message: String
) {
    // インスタンスの作成にロジックや処理が入るからファクトリメソッドにした
    companion object {
        fun responseOf (request: HelloWorldRequest): HelloWorldResponse {
            return HelloWorldResponse(message = "Hello, " + request.name)
        }
    }
}
