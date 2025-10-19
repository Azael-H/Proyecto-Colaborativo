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

data class CategoryUiState(
    val category: Category? = null,
    val items: List<TravelItem> = emptyList(),
    val isLoading: Boolean = true
)

class CategoryViewModel(
    private val repository: TravelRepository = TravelRepository()
) : ViewModel() {

    private val _uiState = MutableStateFlow(CategoryUiState())
    val uiState: StateFlow<CategoryUiState> = _uiState.asStateFlow()

    fun loadCategory(categoryId: String) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true)

            // Buscar la categoría
            repository.getCategories().collect { categories ->
                val category = categories.find { it.id == categoryId }
                _uiState.value = _uiState.value.copy(category = category)
            }

            // Cargar items de la categoría
            repository.getItemsByCategory(categoryId).collect { items ->
                _uiState.value = _uiState.value.copy(
                    items = items,
                    isLoading = false
                )
            }
        }
    }
}