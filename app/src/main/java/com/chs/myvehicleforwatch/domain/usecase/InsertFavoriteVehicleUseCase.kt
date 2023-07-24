package com.chs.myvehicleforwatch.domain.usecase

import com.chs.myvehicleforwatch.domain.model.VehicleInfo
import com.chs.myvehicleforwatch.domain.repository.VehicleRepository
import javax.inject.Inject

class InsertFavoriteVehicleUseCase @Inject constructor(
    private val repository: VehicleRepository
) {
    suspend operator fun invoke(vehicleInfo: VehicleInfo) {
        repository.insertFavoriteVehicle(vehicleInfo)
    }
}