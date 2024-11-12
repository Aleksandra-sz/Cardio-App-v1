package com.example.cardioapp

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
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
fun Profile (
    navController: NavHostController
) {
    Column(
        modifier = Modifier
            .background(color = CardioColors().BackgroundChat)
            .fillMaxSize()
    ) {
        ProfileHeader(navController)
        ProfileName()
    }
}

@Composable
fun ProfileHeader(navController: NavHostController) {
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
            text = "Profile",
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
    }
}

@Composable
fun ProfileName() {
    var name by remember {
        mutableStateOf("")}

    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
//        Text(
//            text ="Enter your name"
//        )

        OutlinedTextField(
            value = name,
            onValueChange = { name = it},
            label =
            {Text("Name")
            },
            modifier = Modifier
                .fillMaxWidth()
        )
    }

}



@Preview(showBackground = true)
@Composable
fun ProfilePreview() {
    CARDIOAPPTheme {
        Profile(navController = rememberNavController())
    }
}