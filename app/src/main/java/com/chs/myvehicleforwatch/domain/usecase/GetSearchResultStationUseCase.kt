package com.chs.myvehicleforwatch.domain.usecase

import com.chs.myvehicleforwatch.common.Resource
import com.chs.myvehicleforwatch.domain.model.StationInfo
import com.chs.myvehicleforwatch.domain.repository.SubWayRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetSearchResultStationUseCase @Inject constructor(
    private val subWayRepository: SubWayRepository
) {
    suspend operator fun invoke(query: String): Flow<Resource<List<StationInfo>>> {
        return subWayRepository.getSearchResultStation(query = query)
    }
}
