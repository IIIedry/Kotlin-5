package com.example.addnavigation.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.addnavigation.model.MenuItem
import com.example.addnavigation.ui.BaseMenuScreen

@Composable
fun EntreeMenuScreen(
    options: List<MenuItem.EntreeItem>,
    onCancelButtonClicked: () -> Unit,
    onNextButtonClicked: () -> Unit,
    onSelectionChanged: (MenuItem.EntreeItem) -> Unit,
    modifier: Modifier = Modifier
) {
    BaseMenuScreen(
        options = options,
        onCancelButtonClicked = onCancelButtonClicked,
        onNextButtonClicked = onNextButtonClicked,
        onSelectionChanged = onSelectionChanged as (MenuItem) -> Unit,
        modifier = modifier
    )
}