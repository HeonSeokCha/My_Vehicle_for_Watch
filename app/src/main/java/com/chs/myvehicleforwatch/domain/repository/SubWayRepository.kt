package com.chs.myvehicleforwatch.domain.repository

import com.chs.myvehicleforwatch.common.Resource
import com.chs.myvehicleforwatch.domain.model.StationArrivalInfo
import com.chs.myvehicleforwatch.domain.model.StationInfo
import kotlinx.coroutines.flow.Flow

interface SubWayRepository {

    suspend fun getSearchResultStation(query: String): Flow<Resource<List<StationInfo>>>

    suspend fun getStationArrivalInfo(stationName: String): Flow<Resource<List<StationArrivalInfo>>>
}