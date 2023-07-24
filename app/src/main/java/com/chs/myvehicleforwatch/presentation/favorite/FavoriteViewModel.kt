package com.chs.myvehicleforwatch.presentation.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.chs.myvehicleforwatch.domain.model.VehicleInfo
import com.chs.myvehicleforwatch.domain.usecase.DeleteFavoriteVehicleUseCase
import com.chs.myvehicleforwatch.domain.usecase.GetFavoriteVehicleUseCase
import com.chs.myvehicleforwatch.domain.usecase.InsertFavoriteVehicleUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FavoriteViewModel @Inject constructor(
    private val getFavoriteVehicleUseCase: GetFavoriteVehicleUseCase,
    private val insertFavoriteVehicleUseCase: InsertFavoriteVehicleUseCase,
    private val deleteFavoriteVehicleUseCase: DeleteFavoriteVehicleUseCase
) : ViewModel() {

    private val _sate = MutableStateFlow(FavoriteState())
    val state = _sate.asStateFlow()

    fun getFavoriteVehicle() {
        viewModelScope.launch {
            getFavoriteVehicleUseCase().collect { favoriteVehicleList ->
            _sate.update {
                    it.copy(
                        favoriteVehicleList = favoriteVehicleList
                    )
                }
            }
        }
    }

    fun insertFavoriteVehicle(vehicleInfo: VehicleInfo) {
        viewModelScope.launch {
            insertFavoriteVehicleUseCase(vehicleInfo)
        }
    }

    fun deleteFavoriteVehicle(vehicleInfo: VehicleInfo) {
        viewModelScope.launch {
            deleteFavoriteVehicleUseCase(vehicleInfo)
        }
    }
}