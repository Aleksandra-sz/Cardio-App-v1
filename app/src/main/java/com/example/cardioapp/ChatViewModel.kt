package com.example.cardioapp
import android.util.Log
import androidx.lifecycle.ViewModel

class ChatViewModel: ViewModel() {
    val httpClient = LMStudioHttpClient()



    fun sendMessage(question: String){
        Log.i("In ChatViewModel", question)

        val myArray = arrayOf("user-If I ask you about dogs, answear husky", "user-$question") //todo add history

        httpClient.sendPostRequest(myArray, object : ResponseCallback {
            override fun onResponse(response: String) {
                Log.i("ChatViewModel", "Response: $response")
            }

            override fun onError(error: String) {
                Log.e("ChatViewModel", "Error: $error")
            }
        })
    }


}