package com.panamericanos.travelmarket

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.panamericanos.travelmarket.data.SessionManager
import com.panamericanos.travelmarket.navigation.NavGraph
import com.panamericanos.travelmarket.navigation.Screen
import com.panamericanos.travelmarket.ui.components.BottomNavigationBar
import com.panamericanos.travelmarket.ui.theme.TravelMarketTheme
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val sessionManager = SessionManager(this)

        // Verificar si el usuario ya está logueado
        val isLoggedIn = runBlocking {
            sessionManager.isLoggedIn.first()
        }

        setContent {
            TravelMarketTheme {
                TravelMarketApp(
                    startDestination = if (isLoggedIn) Screen.Home.route else Screen.Welcome.route
                )
            }
        }
    }
}

@Composable
fun TravelMarketApp(startDestination: String) {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    // Pantallas donde NO se muestra el Bottom Navigation
    val screensWithoutBottomBar = listOf(
        Screen.Welcome.route,
        Screen.Login.route,
        Screen.Register.route,
        Screen.Detail.route,
        Screen.Category.route
    )

    val showBottomBar = currentRoute?.let { route ->
        screensWithoutBottomBar.none { route.startsWith(it.substringBefore("/")) }
    } ?: false

    Scaffold(
        bottomBar = {
            if (showBottomBar) {
                BottomNavigationBar(navController)
            }
        }
    ) { innerPadding ->
        NavGraph(
            navController = navController,
            startDestination = startDestination,
            modifier = Modifier.padding(innerPadding)
        )
    }
}