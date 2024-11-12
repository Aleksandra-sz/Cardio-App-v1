package com.example.cardioapp

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cardioapp.ui.theme.CARDIOAPPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val chatViewModel = ViewModelProvider(this)[ChatViewModel::class.java]
        val cache = getSharedPreferences("app_cache", MODE_PRIVATE)
        val haveIds = cache.getString("chatIds", null)

        cache.edit().clear().commit()
        cache.edit().apply()
        cache.edit().commit()

        if (haveIds == null) {
            CacheTools(cache).saveIntArray("chatIds", IntArray(0))
        }
        setContent {
            CARDIOAPPTheme {
                CardioApp(
                    startDestination = "home",
                    cache = cache
                )
                }
            }
        }
    }

@Composable
fun CardioApp(startDestination: String, cache: SharedPreferences) {
    CardioAppNavGraph(startDestination = startDestination, cache = cache)
}

@Composable
fun CardioAppNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String,
    cache: SharedPreferences
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        composable("home") {
            HomeScreen(
                navController = navController,
                cache = cache
            )
        }

        composable("go_chat/{chatId}") { backStackEntry ->
            var chatId = backStackEntry.arguments?.getString("chatId")?.toIntOrNull()
            if (chatId == null) {
                chatId = 1
            }

            ChatScreen(
                modifier = Modifier,
                viewModel = ChatViewModel(),
                navController = navController,
                cache = cache,
                chatId = chatId
            )
        }

        composable("settings_chat") {
            SettingChatScreen(navController = navController)
        }

        composable("profile"){
            Profile(
                navController = navController,
                cache = cache
            )
        }
    }
}







