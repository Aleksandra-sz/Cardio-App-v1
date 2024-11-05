package com.example.cardioapp
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cardioapp.ui.theme.CARDIOAPPTheme


@Composable
fun  HomeScreen (
    navController: NavHostController
) {
    Column(
        modifier = Modifier
        .padding(16.dp)
        .fillMaxSize()) {
        Spacer(modifier = Modifier.weight(1f))

        Card(
            modifier = Modifier
                .padding(16.dp)
                .height(100.dp)
                .fillMaxWidth()
                .clickable(onClick = {navController.navigate("go_chat")})
        ) {
            Box (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                Text("Chat with your private ", modifier = Modifier
                    .padding(16.dp)
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    CARDIOAPPTheme {
        HomeScreen(navController = rememberNavController())
    }
}