package com.example.cardioapp
import android.annotation.SuppressLint
import android.content.SharedPreferences
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
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cardioapp.ui.theme.CARDIOAPPTheme
import com.example.cardioapp.ui.theme.CardioColors
import kotlin.math.log


@SuppressLint("CommitPrefEdits")
@Composable
fun  HomeScreen (
    navController: NavHostController,
    cache: SharedPreferences
) {
    val cacheTools = CacheTools(cache)
    val name = cache.getString("user_name", "")

    Column(
        modifier = Modifier
            .background(color = CardioColors().BackgroundChat)
        .padding(16.dp)
        .fillMaxSize()) {
        
        Box(modifier = Modifier
            .fillMaxWidth()
        ) {
            Text(
                "Good Morning",
                color = CardioColors().HeaderChat,
                fontSize = 30.sp,
                modifier = Modifier
                    .padding(start = 10.dp, top = 25.dp),
            )

            Box(
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .padding(top = 25.dp)
                    .clickable { navController.navigate("profile") }
            ) {
                Icon(imageVector = PersonCircle, contentDescription = "Person", tint = CardioColors().HeaderChat,
                    modifier = Modifier
                        .size(40.dp))
            }
        }

        Text(
            "$name",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 10.dp),
            style = TextStyle(
                brush = Brush.linearGradient(
                    colors = CardioColors().gradientColors
                )
            )
        )

        Text("Explore",   //Features
            color = CardioColors().HeaderChat,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 10.dp, top = 18.dp, bottom = 5.dp)
        )

        LazyRow (
            modifier = Modifier
                .fillMaxWidth()
        ){
            items(5) { index ->
                Card(
                    modifier = Modifier
                        .padding(10.dp)
                        .height(160.dp)
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
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding(start = 16.dp, end = 16.dp, bottom = 20.dp)
                        )
                            Icon(imageVector = IconsList[index], contentDescription = "Back", tint = CardioColors().HeaderChat,
                                modifier = Modifier
                                    .padding(start = 16.dp, end = 16.dp, bottom = 4.dp)
                                    .align(alignment = Alignment.BottomCenter)
                                    .size(30.dp))

                    }
                }
            }

        }

        Text( "How to use Cardio Assist?",
            color = CardioColors().HeaderChat,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 10.dp, top = 18.dp, bottom = 5.dp))

            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .height(172.dp)
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
                        modifier = Modifier.padding(start = 10.dp, top = 6.dp, bottom = 6.dp)
                    )
                }
                }
            }

        Text("Recent Chats",
            color = CardioColors().HeaderChat,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 10.dp, top = 18.dp, bottom = 5.dp)
        )
        val chatIds = cacheTools.getIntArray("chatIds")
        LazyRow() {
            items(chatIds.size) { index ->
                  val id = chatIds[index].toString()
                  val chat = cache.getString(id, null)
                cache.all
                  if (chat != null) {
                        Card(
                            modifier = Modifier
                                .padding(10.dp)
                                .height(120.dp)
                                .width(200.dp)
                                .clickable(onClick = {
                                    navController.navigate(route = "go_chat/$id")
                                })
                    ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(CardioColors().ChatWindow)
                        .padding(10.dp),
                    contentAlignment = Alignment.Center

                ) {
                    Text(
                        id,
                        color = CardioColors().HeaderChat,
                        modifier = Modifier
                            .padding(6.dp)
                    )
                }
            }
        }
    }
}
        Spacer(modifier = Modifier.weight(1f))
        Card(
            modifier = Modifier
                .padding(16.dp)
                .height(80.dp)
                .fillMaxWidth()
                .clickable(onClick = {
                        val id = cacheTools.generateNewId("chatIds")
                        cacheTools.addOneToArray("chatIds", id)
                        navController.navigate("go_chat/$id")
                    }
                )
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
                    .align(alignment = Alignment.Center)
                )
            }
        }
    }
}

val textsExplore = listOf(
    "Get personalized cardiology advice",
    "Explore modern technology in healthcare",
    "Support in recovery after a heart attack",
    "Easy access to digital therapy",
    "Ask about health anywhere and anytime",
)

val InstructionList = listOf(
    "1. Click on New Chat",
    "2. Ask a question",
    "3. Ask about details",
    "4. View Chat History"
)

val IconsList = listOf(
    HeartPulse,
    Volunteer_activism,
    Hospital,
    Psychology_alt,
    Globe
)

fun displayAllSharedPreferences(prefs: SharedPreferences): String {
    val allEntries = prefs.all
    val result = StringBuilder()

    for ((key, value) in allEntries) {
        result.append("Key: $key, Value: $value\n")
    }
    return result.toString()
}