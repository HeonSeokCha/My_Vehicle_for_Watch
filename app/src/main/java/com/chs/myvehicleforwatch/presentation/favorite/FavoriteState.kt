package com.chs.myvehicleforwatch.presentation.favorite

import com.chs.myvehicleforwatch.domain.model.VehicleInfo

data class FavoriteState(
    val favoriteVehicleList: List<VehicleInfo> = emptyList(),
    val isLoading: Boolean = false,
    val errorMessage: String? = null
)
