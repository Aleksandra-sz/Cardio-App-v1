package com.example.cardioapp
import android.content.SharedPreferences
import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.ViewModel
import kotlinx.serialization.json.Json

class ChatViewModel: ViewModel() {
    val messageList by lazy {
        mutableStateListOf<MessageModel>()
    }

    fun sendMessage(message: String, chatId: Int, cache: SharedPreferences, ): SnapshotStateList<MessageModel> {
        val httpClient = LMStudioHttpClient()

        Log.i("In ChatViewModel", message)
        messageList.add(MessageModel(role = "user", message = message ))
        Log.i("In ChatViewModel", messageList.toString())

        httpClient.sendPostRequest(messageList, object : ResponseCallback {
            override fun onResponse(result: String) {
                try {
                    val messageResponse = Json.decodeFromString<MessageResponse>(result)

                    val choice = messageResponse.choices.firstOrNull()
                    choice?.let {
                        val messageModel = MessageModel(
                            message = it.message.content,
                            role = it.message.role
                        )

                        Log.i("ChatViewModel", "Role: ${messageModel.role}, Content: ${messageModel.message}")
                        messageList.removeAt(messageList.lastIndex)
                        messageList.add(messageModel)

                        val editor = cache.edit()
                        editor.putString(chatId.toString(), saveMessageListAsJson(messageList))
                        editor.apply()
                    }
                } catch (e: Exception) {
                    Log.e("ChatViewModel", "Error parsing response: ${e.message}")
                    val messageModel = MessageModel(
                        message = "Chat bot couldn't response to your question. Please try again later.",
                        role = "System error"
                    )
                    messageList.add(messageModel)
                }
                return
            }

            override fun onError(error: String) {
                Log.e("ChatViewModel", "Error: $error")
                val messageModel = MessageModel(
                    message = "Chat bot couldn't response to your question. Please try again later.",
                    role = "System error"
                )
                messageList.add(messageModel)
                return
            }
        })
        messageList.add((MessageModel(role = "assistant", message = "Typing...")))

        return messageList
    }
}