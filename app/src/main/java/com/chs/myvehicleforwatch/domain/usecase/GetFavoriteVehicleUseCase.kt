package com.chs.myvehicleforwatch.domain.usecase

import com.chs.myvehicleforwatch.domain.model.VehicleInfo
import com.chs.myvehicleforwatch.domain.repository.VehicleRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetFavoriteVehicleUseCase @Inject constructor(
    private val repository: VehicleRepository
) {
    operator fun invoke(): Flow<List<VehicleInfo>> {
        return repository.getFavoriteVehicle()
    }
}