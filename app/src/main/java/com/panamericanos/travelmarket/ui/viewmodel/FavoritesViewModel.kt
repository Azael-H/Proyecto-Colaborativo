package com.panamericanos.travelmarket.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.panamericanos.travelmarket.data.repository.TravelRepository
import com.panamericanos.travelmarket.model.TravelItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

data class FavoritesUiState(
    val favoriteItems: List<TravelItem> = emptyList(),
    val isLoading: Boolean = true
)

class FavoritesViewModel(
    private val repository: TravelRepository = TravelRepository()
) : ViewModel() {

    private val _uiState = MutableStateFlow(FavoritesUiState())
    val uiState: StateFlow<FavoritesUiState> = _uiState.asStateFlow()

    init {
        loadFavorites()
    }

    fun loadFavorites() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true)

            repository.getFavoriteItems().collect { favorites ->
                _uiState.value = _uiState.value.copy(
                    favoriteItems = favorites,
                    isLoading = false
                )
            }
        }
    }

    fun refresh() {
        loadFavorites()
    }
}