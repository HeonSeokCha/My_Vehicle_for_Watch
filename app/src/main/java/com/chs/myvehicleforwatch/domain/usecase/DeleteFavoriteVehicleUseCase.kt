package com.chs.myvehicleforwatch.domain.usecase

import com.chs.myvehicleforwatch.domain.model.VehicleInfo
import com.chs.myvehicleforwatch.domain.repository.VehicleRepository
import javax.inject.Inject

class DeleteFavoriteVehicleUseCase @Inject constructor(
    private val vehicleRepository: VehicleRepository
) {
    suspend operator fun invoke(vehicleInfo: VehicleInfo) {
        vehicleRepository.deleteFavoriteVehicle(vehicleInfo)
    }
}