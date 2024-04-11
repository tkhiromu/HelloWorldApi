package com.example.helloworldapi

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.context.properties.bind.ConstructorBinding
import org.springframework.context.annotation.Configuration

// lateinitはテストしずらいし使わない方がいい
//@Component // 内部的に自動で検知されてインスタンス作られる
//class AppProperties {
//    @Value("\${text}")
//    lateinit var text: String
//}

@Configuration
@EnableConfigurationProperties(AppProperties::class)
class AppPropertiesConfig

@ConfigurationProperties(prefix = "app")
data class AppProperties @ConstructorBinding constructor(val text: String)
