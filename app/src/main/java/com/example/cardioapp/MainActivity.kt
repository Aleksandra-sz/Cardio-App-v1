package com.example.cardioapp

import android.Manifest // Dodaj ten import dla POST_NOTIFICATIONS
import android.annotation.SuppressLint
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
import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.ContentValues.TAG
import android.content.pm.PackageManager
import android.os.Build
import android.util.Log
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.FirebaseApp
import com.google.firebase.messaging.FirebaseMessaging

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        FirebaseApp.initializeApp(this);

        enableEdgeToEdge()
        val chatViewModel = ViewModelProvider(this)[ChatViewModel::class.java]
        val cache = getSharedPreferences("app_cache", MODE_PRIVATE)
        val haveIds = cache.getString("chatIds", null)

        cache.edit().clear().commit()
        cache.edit().apply()
        cache.edit().commit()

        FirebaseMessaging.getInstance().token.addOnCompleteListener { task ->
            if (!task.isSuccessful) {
                Log.w("FCM", "Fetching FCM registration token failed", task.exception)
                return@addOnCompleteListener
            }

            val token = task.result
            Log.d("FCM", "FCM Token: $token")
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(
                    this,
                    Manifest.permission.POST_NOTIFICATIONS
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(Manifest.permission.POST_NOTIFICATIONS),
                    1
                )
            }
        }

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
            SettingChatScreen(
                navController = navController,
            )
        }

        composable("profile"){
            Profile(
                navController = navController,
                cache = cache
            )
        }
    }
}







