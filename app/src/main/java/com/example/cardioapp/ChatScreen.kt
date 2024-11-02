package com.example.cardioapp
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.ElevatedButton
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cardioapp.ui.theme.CARDIOAPPTheme
import org.intellij.lang.annotations.JdkConstants.BoxLayoutAxis

@Composable
fun ChatScreen(
    modifier: Modifier,
    viewModel: ChatViewModel,
    navController: NavHostController,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        AppHeader()
        BackButton {
            navController.navigate("home")
        }
        Spacer(modifier = Modifier.weight(1f))
        InputMess(
            onMessageSend = {
                viewModel.sendMessage(it)
            }
        )
    }
}




@Composable
fun AppHeader(
) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(110.dp)
                .background(MaterialTheme.colorScheme.primary),
        ) {
            Text(
                modifier = Modifier
                    .padding(20.dp),
                text = "Your assistant",
                color = Color.White,
                fontSize = 22.sp
            )
    }
}

@Composable
fun BackButton(
    onClick: () -> Unit,
) {
    TextButton(onClick = { onClick() }) {
        Text("Back")
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


