package com.panamericanos.travelmarket.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.panamericanos.travelmarket.data.repository.TravelRepository
import com.panamericanos.travelmarket.model.TravelItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

data class DetailUiState(
    val item: TravelItem? = null,
    val isLoading: Boolean = true,
    val isFavorite: Boolean = false
)

class DetailViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(DetailUiState())
    val uiState: StateFlow<DetailUiState> = _uiState.asStateFlow()

    fun loadItem(itemId: String) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true)

            TravelRepository.getItemById(itemId).collect { item ->
                _uiState.value = _uiState.value.copy(
                    item = item,
                    isLoading = false,
                    isFavorite = TravelRepository.isFavorite(itemId)
                )
            }
        }
    }

    fun toggleFavorite() {
        val itemId = _uiState.value.item?.id ?: return
        val isFavorite = TravelRepository.toggleFavorite(itemId)
        _uiState.value = _uiState.value.copy(isFavorite = isFavorite)
    }
}