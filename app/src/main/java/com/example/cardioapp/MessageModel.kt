package com.example.cardioapp
import kotlinx.serialization.Serializable

@Serializable
data class MessageModel(
    val message: String,
    val role: String,
)
