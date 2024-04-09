package com.example.helloworldapi

import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.http.ResponseEntity

@RestControllerAdvice
class ExceptionHandlerAdvice {

    /**
     * MethodArgumentNotValidException
     * Valid アノテーションが付けられた引数の検証が失敗した場合にスローされる例外
     * Spring Frameworkがクライアントからのリクエストのバリデーション中に、
     * リクエストが設定されたバリデーション条件を満たさなかった場合にスローされる例外です
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun handleValidationExceptions(ex: MethodArgumentNotValidException): ResponseEntity<Map<String, Any>> {
        // bindingResult
        // データバインディングプロセス（クライアントから送られてきたデータをJavaオブジェクトにマッピングするプロセス）
        // またはバリデーションプロセスの結果を保持します。
        // エラーが発生した場合、これらのエラーはBindingResult内に格納され、後で検査や表示のためにアクセスできます。
        // fieldErrors
        // エラーが発生したフィールド名、エラーコード（バリデーションルールを表す）、デフォルトメッセージなど、エラーに関する情報が含まれます。

        val errors = ex.bindingResult.fieldErrors.map {
            "${it.field}: ${it.defaultMessage}"
        }

        val responseBody = mapOf(
            "reason" to "invalid parameter",
            "detail" to errors
        )

        return ResponseEntity.badRequest().body(responseBody)
    }

    @ExceptionHandler(Exception::class)
    fun handleException(ex: Exception): ResponseEntity<Map<String, Any>> {
        val body = mapOf("reason" to "something wrong ;-(")

        return ResponseEntity.status(500).body(body)
    }
}
