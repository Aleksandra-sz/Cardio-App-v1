package com.example.cardioapp
import android.content.SharedPreferences
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.cardioapp.ui.theme.CardioColors
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Composable
fun ChatScreen(
    modifier: Modifier,
    viewModel: ChatViewModel,
    navController: NavHostController,
    cache: SharedPreferences,
    chatId: Int
) {
    var messageHistory by remember { mutableStateOf(SnapshotStateList<MessageModel>()) }

    val cacheHistory = cache.getString(chatId.toString(), null)
    if (cacheHistory != null) {
        viewModel.messageList.clear()
        deserializeToMessageList(cacheHistory).forEach { message ->
            viewModel.messageList.add(message)
        }
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        val image = painterResource(R.drawable.background)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        AppHeader(navController)
        AddMessages(modifier = Modifier
            .weight(1f),
            viewModel.messageList)
        InputMess(
            onMessageSend = { message ->
                messageHistory = viewModel.sendMessage(message, chatId, cache)
            }
        )
    }
}}

@Composable
fun AddMessages(modifier: Modifier = Modifier, chatHistory: SnapshotStateList<MessageModel>) {
    LazyColumn(modifier = modifier) {
        items(chatHistory){ message ->
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = if (message.role == "user") Arrangement.End else Arrangement.Start
            ) {
                Column(
                    modifier = Modifier
                        .padding(
                            start = if (message.role == "assistant") 16.dp else 64.dp,
                            end = if (message.role == "user") 16.dp else 64.dp,
                            top = 8.dp,
                            bottom = 8.dp
                        )
                        .background(
                            color = if (message.role == "user") CardioColors().UserWindow else CardioColors().ChatWindow,
                            shape = RoundedCornerShape(16.dp)
                        )
                        .padding(12.dp),
                ) {
                    Text(
                        text = message.role,
                        color = Color.Black,
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(bottom = 4.dp)
                    )
                    Text(
                        text = message.message,
                        color = Color.Black,
                        fontSize = 14.sp
                    )
                }
            }
        }
    }
}

@Composable
fun AppHeader(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(110.dp)
            .background(color = CardioColors().HeaderChat)
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(20.dp),
            text = "Cardio Assist",
            color = Color.White,
            fontSize = 22.sp
        )
        Box(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(16.dp)
                .clickable { navController.navigate("home") }
        ) {
            Icon(imageVector = Arrow_back_ios, contentDescription = "Back", tint = Color.White)
        }
        Box(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(16.dp)
                .clickable { navController.navigate("settings_chat") }
        ) {
            Icon(imageVector = Icons.Default.Settings, contentDescription = "Settings", tint = Color.White)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputMess(onMessageSend: (String) -> Unit) {
    var message by remember {
        mutableStateOf("")
    }
    Row(
        modifier = Modifier
            .padding(15.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        OutlinedTextField(

            modifier = Modifier
                .background(color = CardioColors().TextFieldChat)
                .weight(1f),
            value = message,
            onValueChange = {
                message = it
            },


        )
        IconButton(onClick = {
            onMessageSend(message)
            message = ""
        }) {
            Icon(imageVector = Icons.AutoMirrored.Filled.Send, contentDescription = "Send", tint = CardioColors().HeaderChat)
        }
    }
}


fun deserializeToMessageList(jsonString: String): SnapshotStateList<MessageModel> {
    val messageList: List<MessageModel> = Json.decodeFromString(jsonString)

    return mutableStateListOf(*messageList.toTypedArray())
}

fun saveMessageListAsJson(messageList: SnapshotStateList<MessageModel>): String {
    val messageListAsList = messageList.toList()

    return Json.encodeToString(messageListAsList)
}