package com.panamericanos.travelmarket.model

data class TravelItem(
    val id: String,
    val title: String,
    val category: String,
    val description: String,
    val imageUrl: String,
    val rating: Float,
    val reviewCount: Int,
    val price: String?,
    val location: String,
    val isFavorite: Boolean = false
)