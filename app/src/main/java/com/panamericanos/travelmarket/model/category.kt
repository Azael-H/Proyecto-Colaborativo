package com.panamericanos.travelmarket.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

data class Category(
    val id: String,
    val name: String,
    val iconName: String,
    val description: String,
    val itemCount: Int
) {
    fun getIcon(): ImageVector {
        return when (id) {
            "eventos" -> Icons.Default.Stadium
            "lugares" -> Icons.Default.Place
            "gastronomia" -> Icons.Default.Restaurant
            "transporte" -> Icons.Default.DirectionsCar
            "alojamiento" -> Icons.Default.Hotel
            "experiencias" -> Icons.Default.TheaterComedy
            else -> Icons.Default.Category
        }
    }
}