package com.example.cardioapp

import okhttp3.*
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import java.io.IOException

interface ResponseCallback {
    fun onResponse(result: String)
    fun onError(error: String)
}

class LMStudioHttpClient {
    private val client = OkHttpClient()

    fun sendPostRequest(messages: Array<String>, callback: ResponseCallback) {
        val url = "http://10.0.2.2:1234/v1/chat/completions"
        val json = buildMessagesJson(messages)
        val requestBody = RequestBody.create("application/json; charset=utf-8".toMediaTypeOrNull(), json)

        val request = Request.Builder()
            .url(url)
            .post(requestBody)
            .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                e.printStackTrace() // Obsługa błędu
                callback.onError("Request failed: ${e.message}") // Wywołanie metody w przypadku błędu
            }

            override fun onResponse(call: Call, response: Response) {
                if (response.isSuccessful) {
                    response.body?.string()?.let { body ->
                        callback.onResponse(body)
                    } ?: callback.onError("Response body is null")
                } else {
                    callback.onError("Error: ${response.code}")
                }
            }
        })
    }

    private fun buildMessagesJson(inputs: Array<String>): String {
        val messagesList = inputs.map { input ->
            val (role, content) = input.split("-")
            "{\"role\": \"$role\", \"content\": \"$content\"}"
        }

        return "{\"messages\": [${messagesList.joinToString(",")}]}"
    }

}