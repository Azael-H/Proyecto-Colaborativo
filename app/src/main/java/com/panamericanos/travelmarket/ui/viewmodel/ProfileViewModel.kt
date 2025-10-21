package com.panamericanos.travelmarket.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.panamericanos.travelmarket.data.repository.TravelRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

data class ProfileUiState(
    val favoritesCount: Int = 0,
    val visitedPlacesCount: Int = 0,
    val reviewsCount: Int = 0
)

class ProfileViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(ProfileUiState())
    val uiState: StateFlow<ProfileUiState> = _uiState.asStateFlow()

    fun loadStats() {
        viewModelScope.launch {
            _uiState.value = ProfileUiState(
                favoritesCount = TravelRepository.getFavoritesCount(),
                visitedPlacesCount = TravelRepository.getVisitedPlacesCount(),
                reviewsCount = TravelRepository.getReviewsCount()
            )
        }
    }
}




