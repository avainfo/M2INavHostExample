package com.example.m2iappmobile.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.m2iappmobile.components.MainBottomBar

@Composable
fun HomeScreen(navController: NavHostController, messageController: NavHostController) {
	Scaffold(
		bottomBar = {
			MainBottomBar(navController = navController)
		},
	) { safeArea ->
		NavHost(
			navController = navController,
			startDestination = "MainScreen",
			modifier = Modifier.padding(safeArea),
		) {
			composable("MainScreen") {
				MainScreen(messageController)
			}
			composable("SearchScreen") {
				MainScreen(messageController)
			}
			composable("AddScreen") {
				MainScreen(messageController)
			}
			composable("PlayScreen") {
				MainScreen(messageController)
			}
			composable("AccountScreen") {
				MainScreen(messageController)
			}
		}
	}
}