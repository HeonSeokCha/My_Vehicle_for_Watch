package com.chs.myvehicleforwatch.presentation.search

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.wear.compose.foundation.lazy.AutoCenteringParams
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.foundation.lazy.items
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.CircularProgressIndicator
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.Text
import com.chs.myvehicleforwatch.presentation.StationInfoCard

@Composable
fun SearchScreen(
    viewModel: SearchViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    LaunchedEffect(state.searchQuery) {
        if (state.searchQuery != null) {
            viewModel.getSearchResult(state.searchQuery!!)
        }
    }

    ScalingLazyColumn(
        modifier = Modifier.fillMaxSize(),
        autoCentering = AutoCenteringParams(itemIndex = 0),
    ) {
        if (state.searchResultList.isEmpty()) {
            item {
                when {
                    state.isError != null -> {
                        Text(state.isError!!)
                    }

                    state.isLoading -> {
                        CircularProgressIndicator()
                    }

                    else -> {
                        Button(onClick = {
                            viewModel.searchStation("태릉입구")
                        }) {
                            Icon(imageVector = Icons.Default.Search , contentDescription = null)
                        }
                    }
                }
            }
        }

        items(state.searchResultList) {
            StationInfoCard(stationInfo = it) { stationName ->  
                
            }
        }
    }
}