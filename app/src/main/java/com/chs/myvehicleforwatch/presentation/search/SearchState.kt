package com.chs.myvehicleforwatch.presentation.search

import com.chs.myvehicleforwatch.domain.model.StationInfo

data class SearchState(
    val isLoading: Boolean = false,
    val searchQuery: String? = null,
    val searchResultList: List<StationInfo> = emptyList(),
    val isError: String? = null,
)
