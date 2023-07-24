package com.chs.myvehicleforwatch.data.repository

import com.chs.myvehicleforwatch.domain.model.VehicleInfo
import com.chs.myvehicleforwatch.domain.repository.VehicleRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class VehicleRepositoryImpl @Inject constructor(
) : VehicleRepository {
    override fun getFavoriteVehicle(): Flow<List<VehicleInfo>> {
        TODO("Not yet implemented")
    }

    override suspend fun insertFavoriteVehicle(vehicleInfo: VehicleInfo) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteFavoriteVehicle(vehicleInfo: VehicleInfo) {
        TODO("Not yet implemented")
    }
}