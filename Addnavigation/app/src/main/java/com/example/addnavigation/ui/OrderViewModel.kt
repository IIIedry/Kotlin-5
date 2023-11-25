package com.example.addnavigation.ui

import androidx.lifecycle.ViewModel
import com.example.addnavigation.model.MenuItem
import com.example.addnavigation.model.OrderUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update

class OrderViewModel : ViewModel() {

    private val taxRate = 0.08

    private val _uiState = MutableStateFlow(OrderUiState())

    fun updateEntree(entree: MenuItem.EntreeItem) {
        val previousEntree = _uiState.value.entree
        updateItem(entree, previousEntree)
    }

    private fun updateItem(newItem: MenuItem, previousItem: MenuItem?){
        _uiState.update { currentState ->
            val previousItemPrice = previousItem?.price ?: 0.0
            // subtract previous item price in case an item of this category was already added.
            val itemTotalPrice = currentState.itemTotalPrice - previousItemPrice + newItem.price
            // recalculate tax
            val tax = itemTotalPrice * taxRate
            currentState.copy(
                itemTotalPrice = itemTotalPrice,
                orderTax = tax,
                orderTotalPrice = itemTotalPrice + tax,
                entree = if (newItem is MenuItem.EntreeItem) newItem else currentState.entree,
                sideDish = if (newItem is MenuItem.SideDishItem) newItem else currentState.sideDish,
                accompaniment =
                if (newItem is MenuItem.AccompanimentItem) newItem else currentState.accompaniment
            )
        }
    }

}