package com.panamericanos.travelmarket.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.panamericanos.travelmarket.ui.components.CategoryCard
import com.panamericanos.travelmarket.ui.components.TravelItemCard
import com.panamericanos.travelmarket.ui.viewmodel.HomeViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onNavigateToCategory: (String) -> Unit,
    onNavigateToDetail: (String) -> Unit,
    viewModel: HomeViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "TravelMarket",
                        style = MaterialTheme.typography.headlineSmall
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary
                )
            )
        }
    ) { paddingValues ->
        if (uiState.isLoading) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
        } else {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentPadding = PaddingValues(bottom = 16.dp)
            ) {
                // Barra de búsqueda
                item {
                    OutlinedTextField(
                        value = uiState.searchQuery,
                        onValueChange = { viewModel.onSearchQueryChange(it) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 16.dp),
                        placeholder = { Text("Buscar lugares, eventos...") },
                        leadingIcon = {
                            Icon(Icons.Default.Search, contentDescription = "Buscar")
                        },
                        singleLine = true,
                        shape = MaterialTheme.shapes.large
                    )
                }

                // Mostrar resultados de búsqueda
                if (uiState.searchQuery.isNotBlank()) {
                    item {
                        Text(
                            text = "Resultados (${uiState.searchResults.size})",
                            style = MaterialTheme.typography.titleMedium,
                            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                        )
                    }

                    items(uiState.searchResults.size) { index ->
                        TravelItemCard(
                            item = uiState.searchResults[index],
                            onClick = { onNavigateToDetail(uiState.searchResults[index].id) },
                            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                        )
                    }
                } else {
                    // Sección de categorías
                    item {
                        Column(modifier = Modifier.padding(vertical = 8.dp)) {
                            Text(
                                text = "Categorías",
                                style = MaterialTheme.typography.headlineSmall,
                                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                            )

                            LazyRow(
                                contentPadding = PaddingValues(horizontal = 16.dp),
                                horizontalArrangement = Arrangement.spacedBy(12.dp)
                            ) {
                                items(uiState.categories) { category ->
                                    CategoryCard(
                                        category = category,
                                        onClick = { onNavigateToCategory(category.id) }
                                    )
                                }
                            }
                        }
                    }

                    // Sección de destacados
                    item {
                        Text(
                            text = "Destacados",
                            style = MaterialTheme.typography.headlineSmall,
                            modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp)
                        )
                    }

                    // Lista de items destacados
                    items(uiState.featuredItems.size) { index ->
                        TravelItemCard(
                            item = uiState.featuredItems[index],
                            onClick = { onNavigateToDetail(uiState.featuredItems[index].id) },
                            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                        )
                    }
                }
            }
        }
    }
}