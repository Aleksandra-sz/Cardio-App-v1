package com.example.cardioapp
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Card
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
            .background(color = CardioColors().HeaderChat)
        .padding(16.dp)
        .fillMaxSize()) {

        Box(                    //Good Morning
            modifier = Modifier
                .padding(16.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(
                "Good Morning!",
                color = Color.Black,
                fontSize = 30.sp,
                modifier = Modifier
                    .padding(16.dp),
            )
        }

        LazyRow (               //App pros
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ){
            items(5) { index ->
                Card(
                    modifier = Modifier
                        .padding(16.dp)
                        .height(150.dp)
                        .width(200.dp)
                        //.clickable(onClick = { navController.navigate("go_chat") })
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(CardioColors().UserWindow)
                            .padding(16.dp),
                        contentAlignment = Alignment.BottomCenter
                    ) {
                        Text(
                            "Ask about your helath any time!",
                            color = Color.Black,
                            modifier = Modifier
                                .padding(16.dp)
                        )
                    }
                }
            }

        }

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
                    .background(CardioColors().UserWindow)
                    .padding(16.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                Text("Chat with your private assistant",
                    color = Color.Black,
                    modifier = Modifier
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