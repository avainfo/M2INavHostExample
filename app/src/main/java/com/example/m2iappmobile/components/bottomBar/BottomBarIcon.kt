package com.example.m2iappmobile.components.bottomBar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController

@Composable
fun BottomBarIcon(
	icon: ImageVector = Icons.Rounded.Info,
	route: String,
	navController: NavHostController,
) {
	IconButton(onClick = { navController.navigate(route) }) {
		Icon(
			icon,
			contentDescription = "Localized description",
		)
	}
}