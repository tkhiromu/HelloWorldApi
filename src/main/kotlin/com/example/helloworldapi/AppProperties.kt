package com.example.helloworldapi

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component // 内部的に自動で検知されてインスタンス作られる
class AppProperties {
    @Value("\${text}")
    lateinit var text: String
}
