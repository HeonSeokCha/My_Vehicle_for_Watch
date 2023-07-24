package com.chs.myvehicleforwatch.domain.repository

import com.chs.myvehicleforwatch.domain.model.VehicleInfo
import kotlinx.coroutines.flow.Flow

interface VehicleRepository {

    fun getFavoriteVehicle(): Flow<List<VehicleInfo>>

    suspend fun insertFavoriteVehicle(vehicleInfo: VehicleInfo)

    suspend fun deleteFavoriteVehicle(vehicleInfo: VehicleInfo)
}