package com.chs.myvehicleforwatch.presentation.search

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.Text

@Composable
fun SearchScreen(
    viewModel: SearchViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    LaunchedEffect(state.searchQuery) {
        if (state.searchQuery != null) {
            Log.e("TEST", state.searchQuery!!)
            viewModel.getSearchResult(state.searchQuery!!)
        }
    }

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Button(onClick = {
                viewModel.searchStation("태릉입구")
            }) {
                Icon(imageVector = Icons.Default.Search , contentDescription = null)
            }
            if (state.isError != null) {
                Text(state.isError!!)
            }
        }

        items(state.searchResultList) {
            Text(
                text = it.stationName
            )

            Text(
                text = it.lineInfo
            )
        }
    }
}