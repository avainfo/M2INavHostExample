package com.example.m2iappmobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.m2iappmobile.components.MainBottomBar
import com.example.m2iappmobile.screens.HomeScreen
import com.example.m2iappmobile.screens.MainScreen
import com.example.m2iappmobile.screens.MessagesScreen
import com.example.m2iappmobile.ui.theme.M2IAppMobileTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			M2IAppMobileTheme {
				val navController = rememberNavController();
				val messageController = rememberNavController();
				NavHost(navController = messageController, startDestination = "Main") {
					composable("Main") {
						HomeScreen(navController = navController, messageController = messageController)
					}
					composable("Message") {
						MessagesScreen()
					}
				}
			}
		}
	}
}