package com.example.m2iappmobile.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.m2iappmobile.components.bottomBar.BottomBarIcon

@Composable
fun MainBottomBar(modifier: Modifier = Modifier, navController: NavHostController) {
	BottomAppBar(
		content = {
			Row(
				verticalAlignment = Alignment.CenterVertically,
				horizontalArrangement = Arrangement.SpaceAround,
				modifier = Modifier.fillMaxWidth(),
			) {
				BottomBarIcon(
					Icons.Filled.Home,
					route = "MainScreen",
					navController = navController,
				)
				BottomBarIcon(
					Icons.Filled.Search,
					route = "SearchScreen",
					navController = navController,
				)
				BottomBarIcon(
					Icons.Filled.Add,
					route = "AddScreen",
					navController = navController,
				)
				BottomBarIcon(
					Icons.Filled.PlayArrow,
					route = "PlayScreen",
					navController = navController,
				)
				BottomBarIcon(
					Icons.Filled.AccountCircle,
					route = "AccountScreen",
					navController = navController,
				)
			}
		}, modifier = Modifier
	)
}