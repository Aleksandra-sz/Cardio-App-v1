package com.example.cardioapp
import android.util.Log
import androidx.lifecycle.ViewModel

class ChatViewModel: ViewModel() {
    val httpClient = LMStudioHttpClient()

    fun sendMessage(history: MutableList<String>):MutableList<String>{
        Log.i("In ChatViewModel", history.toString())

        httpClient.sendPostRequest(history, object : ResponseCallback {
            override fun onResponse(response: String) {
                Log.i("ChatViewModel", "Response: $response")

            }

            override fun onError(error: String) {
                Log.e("ChatViewModel", "Error: $error")
            }
        })
        return history
    }
}