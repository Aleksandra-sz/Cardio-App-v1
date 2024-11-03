package com.example.cardioapp
import androidx.compose.foundation.background
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ChatScreen(
    modifier: Modifier,
    viewModel: ChatViewModel,
    navController: NavHostController,
) {
    var messageHistory by remember { mutableStateOf(SnapshotStateList<MessageModel>()) }

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        AppHeader(navController)
        AddMessages(modifier,viewModel.messageList)
        Spacer(modifier = Modifier.weight(1f))
        InputMess(
            onMessageSend = { message ->
                messageHistory = viewModel.sendMessage(message)
            }
        )
    }
}

@Composable
fun AddMessages(modifier: Modifier = Modifier, chatHistory: SnapshotStateList<MessageModel>) {
    LazyColumn {
        items(chatHistory){
            Column(
                modifier = Modifier.background(color = Color.Gray),horizontalAlignment = Alignment.End
            ){
                Text(
                    modifier = Modifier
                        .padding(20.dp),
                    text = it.role,
                    color = Color.Black,
                    fontSize = 12.sp,
                )
                Text(
                    modifier = Modifier
                        .padding(20.dp),
                    text = it.message,
                    color = Color.Black,
                    fontSize = 22.sp
                )
            }
        }
    }
}

@Composable
fun AppHeader(navController: NavHostController
) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(110.dp)
                .background(MaterialTheme.colorScheme.primary),
        ) {
            Column {
                Text(
                    modifier = Modifier
                        .padding(20.dp),
                    text = "Your assistant",
                    color = Color.White,
                    fontSize = 22.sp
                )
                BackButton {
                    navController.navigate("home")
                }
            }
    }
}

@Composable
fun BackButton(
    onClick: () -> Unit,
) {
    Spacer(modifier = Modifier.width(16.dp))
    TextButton(
        onClick = { onClick() }
    ) {
        Text("Back", color = Color.White)
    }
}

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
                .weight(1f),
            value = message,
            onValueChange = {
                message = it
            }
        )
        IconButton(onClick = {
            onMessageSend(message)
            message = ""
        }) {
            Icon(imageVector = Icons.Default.Send, contentDescription = "Send")
        }
    }
}


