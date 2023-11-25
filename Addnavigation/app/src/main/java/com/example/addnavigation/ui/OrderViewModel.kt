package com.example.addnavigation.ui

import androidx.lifecycle.ViewModel
import com.example.addnavigation.model.MenuItem
import com.example.addnavigation.model.OrderUiState
import kotlinx.coroutines.flow.MutableStateFlow

class OrderViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(OrderUiState())

    fun updateEntree(entree: MenuItem.EntreeItem) {
        val previousEntree = _uiState.value.entree
        updateItem(entree, previousEntree)
    }

    private fun updateItem(newItem: MenuItem, previousItem: MenuItem?){

    }

}