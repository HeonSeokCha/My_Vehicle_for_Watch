package com.chs.myvehicleforwatch.domain.usecase

import com.chs.myvehicleforwatch.common.Resource
import com.chs.myvehicleforwatch.domain.model.StationArrivalInfo
import com.chs.myvehicleforwatch.domain.repository.SubWayRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetStationArrivalInfoUseCase @Inject constructor(
    private val subWayRepository: SubWayRepository
) {
    suspend operator fun invoke(stationName: String): Flow<Resource<List<StationArrivalInfo>>> {
        return subWayRepository.getStationArrivalInfo(stationName = stationName)
    }
}