package com.panamericanos.travelmarket.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.panamericanos.travelmarket.data.repository.TravelRepository
import com.panamericanos.travelmarket.model.Category
import com.panamericanos.travelmarket.model.TravelItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

data class HomeUiState(
    val categories: List<Category> = emptyList(),
    val featuredItems: List<TravelItem> = emptyList(),
    val isLoading: Boolean = true,
    val searchQuery: String = "",
    val searchResults: List<TravelItem> = emptyList()
)

class HomeViewModel(
    private val repository: TravelRepository = TravelRepository()
) : ViewModel() {

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    init {
        loadData()
    }

    private fun loadData() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true)

            repository.getCategories().collect { categories ->
                _uiState.value = _uiState.value.copy(categories = categories)
            }

            repository.getFeaturedItems().collect { items ->
                _uiState.value = _uiState.value.copy(
                    featuredItems = items,
                    isLoading = false
                )
            }
        }
    }

    fun onSearchQueryChange(query: String) {
        _uiState.value = _uiState.value.copy(searchQuery = query)

        if (query.isBlank()) {
            _uiState.value = _uiState.value.copy(searchResults = emptyList())
            return
        }

        viewModelScope.launch {
            repository.searchItems(query).collect { results ->
                _uiState.value = _uiState.value.copy(searchResults = results)
            }
        }
    }

    fun refresh() {
        loadData()
    }
}