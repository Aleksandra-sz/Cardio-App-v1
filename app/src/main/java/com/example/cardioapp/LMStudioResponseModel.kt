package com.example.cardioapp

import kotlinx.serialization.Serializable

@Serializable
data class MessageResponse(
    val id: String,
    val `object`: String,
    val created: Long,
    val model: String,
    val choices: List<Choice>,
    val usage: Usage,
    val system_fingerprint: String
)

@Serializable
data class Choice(
    val index: Int,
    val message: Message,
    val logprobs: String?,
    val finish_reason: String?
)

@Serializable
data class Message(
    val role: String,
    val content: String
)

@Serializable
data class Usage(
    val prompt_tokens: Int,
    val completion_tokens: Int,
    val total_tokens: Int
)
