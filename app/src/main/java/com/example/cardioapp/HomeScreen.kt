package com.example.cardioapp
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cardioapp.ui.theme.CARDIOAPPTheme
import com.example.cardioapp.ui.theme.CardioColors



@Composable
fun  HomeScreen (
    navController: NavHostController
) {
    Column(
        modifier = Modifier
            .background(color = CardioColors().BackgroundChat)
        .padding(16.dp)
        .fillMaxSize()) {
        
        Box(modifier = Modifier
            .fillMaxWidth()
        ) {
            Text(
                //Good Morning
                "Good Morning!",
                color = CardioColors().HeaderChat,
                fontSize = 30.sp,
                modifier = Modifier
                    .padding(16.dp),
            )
            Box(  //Profile Icon
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .padding(16.dp)
                    .clickable { navController.navigate("profile") }
            ) {
                Icon(imageVector = Icons.Default.Person, contentDescription = "Person", tint = CardioColors().HeaderChat)
            }
        }

        Text("Explore",   //Features
            color = CardioColors().HeaderChat,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(10.dp)
        )

        LazyRow (               //App pros
            modifier = Modifier
                .fillMaxWidth()
        ){
            items(5) { index ->
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .height(170.dp)
                        .width(200.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(CardioColors().ChatWindow)
                            .padding(16.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            textsExplore[index],
                            color = CardioColors().HeaderChat,
                            modifier = Modifier
                                .padding(16.dp)
                        )
                    }
                }
            }

        }

        Text( "How to use Cardio Assist?",
            color = CardioColors().HeaderChat,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(10.dp))

            Card(                       //How to use it
                modifier = Modifier
                    .padding(8.dp)
                    .height(190.dp)
                    .fillMaxWidth()
            ) {
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .background(CardioColors().HeaderChat)
                        .padding(16.dp),
                ) {
                    InstructionList.forEach { instruction ->
                    Text(
                        text = instruction,
                        color = Color.White,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                }
                }
            }



        Text("Recent chats",   //sth
            color = CardioColors().HeaderChat,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(10.dp)
        )

        Spacer(modifier = Modifier.weight(1f))

        Card(                       //Go chat
            modifier = Modifier
                .padding(16.dp)
                .height(100.dp)
                .fillMaxWidth()
                .clickable(onClick = {navController.navigate("go_chat")})
        ) {
            Box (
                modifier = Modifier
                    .fillMaxSize()
                    .background(CardioColors().HeaderChat)
                    .padding(16.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                Text("New chat",
                    color = CardioColors().BackgroundChat,
                    modifier = Modifier
                    .padding(16.dp)
                )
            }
        }
    }
}

val textsExplore = listOf(
    "Get personalized cardiology advice",
    "Explore modern technology in healthcare",
    "Receive support for rehabilitation after a heart attack",
    "Access to digital therapy",
    "Ask about your health anytime, anywhere",
)

val InstructionList = listOf(
    "1. Click on New Chat",
    "2. Ask a question",
    "3. Ask about details",
    "4. View chat history"
)


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    CARDIOAPPTheme {
        HomeScreen(navController = rememberNavController())
    }
}