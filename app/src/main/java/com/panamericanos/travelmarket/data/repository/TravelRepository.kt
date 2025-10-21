package com.panamericanos.travelmarket.data.repository

import com.panamericanos.travelmarket.data.SampleData
import com.panamericanos.travelmarket.model.Category
import com.panamericanos.travelmarket.model.TravelItem
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

object TravelRepository {

    // Gestión de favoritos
    private val favoriteIds = mutableSetOf<String>()

    fun getCategories(): Flow<List<Category>> = flow {
        delay(500)
        emit(SampleData.categories)
    }

    fun getFeaturedItems(): Flow<List<TravelItem>> = flow {
        delay(500)
        emit(SampleData.featuredItems)
    }

    fun getItemsByCategory(categoryId: String): Flow<List<TravelItem>> = flow {
        delay(300)
        emit(SampleData.getItemsByCategory(categoryId))
    }

    fun getItemById(itemId: String): Flow<TravelItem?> = flow {
        delay(200)
        emit(SampleData.getItemById(itemId))
    }

    fun searchItems(query: String): Flow<List<TravelItem>> = flow {
        delay(300)
        val filteredItems = SampleData.featuredItems.filter {
            it.title.contains(query, ignoreCase = true) ||
                    it.description.contains(query, ignoreCase = true) ||
                    it.category.contains(query, ignoreCase = true) ||
                    it.location.contains(query, ignoreCase = true)
        }
        emit(filteredItems)
    }

    fun toggleFavorite(itemId: String): Boolean {
        return if (favoriteIds.contains(itemId)) {
            favoriteIds.remove(itemId)
            false
        } else {
            favoriteIds.add(itemId)
            true
        }
    }

    fun isFavorite(itemId: String): Boolean {
        return favoriteIds.contains(itemId)
    }

    fun getFavoriteItems(): Flow<List<TravelItem>> = flow {
        delay(200)
        val favorites = SampleData.featuredItems.filter {
            favoriteIds.contains(it.id)
        }
        emit(favorites)
    }


    fun getFavoritesCount(): Int {
        return favoriteIds.size
    }

    fun getVisitedPlacesCount(): Int {

        return 0
    }

    fun getReviewsCount(): Int {

        return 0
    }
}
