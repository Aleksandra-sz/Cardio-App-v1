package com.example.cardioapp

import androidx.compose.runtime.snapshots.SnapshotStateList
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import java.io.IOException
import java.util.concurrent.TimeUnit

interface ResponseCallback {
    fun onResponse(result: String)
    fun onError(error: String)
}

class LMStudioHttpClient {
    private val client = OkHttpClient.Builder().connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .build()

    fun sendPostRequest(messages: SnapshotStateList<MessageModel>, callback: ResponseCallback) {
        val url = "http://10.0.2.2:1234/v1/chat/completions"
        val json = buildMessagesJson(messages)
        val requestBody = RequestBody.create("application/json; charset=utf-8".toMediaTypeOrNull(), json)

        val request = Request.Builder()
            .url(url)
            .post(requestBody)
            .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                e.printStackTrace()
                callback.onError("Request failed: ${e.message}")
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

    private fun buildMessagesJson(inputs: SnapshotStateList<MessageModel>): String {
        val messagesList = inputs.map { messageModel ->
            "{\"role\": \"${messageModel.role}\", \"content\": \"${messageModel.message}\"}"
        }

        return "{\"messages\": [${messagesList.joinToString(",")}]}"
    }
}
