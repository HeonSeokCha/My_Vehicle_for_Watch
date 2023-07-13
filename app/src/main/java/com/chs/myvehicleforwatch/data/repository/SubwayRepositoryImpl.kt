package com.chs.myvehicleforwatch.data.repository

import com.chs.myvehicleforwatch.common.Constants
import com.chs.myvehicleforwatch.common.Resource
import com.chs.myvehicleforwatch.data.api.MyVehicleService
import com.chs.myvehicleforwatch.domain.mapper.toStationArrivalInfo
import com.chs.myvehicleforwatch.domain.mapper.toStationInfo
import com.chs.myvehicleforwatch.domain.model.StationArrivalInfo
import com.chs.myvehicleforwatch.domain.model.StationInfo
import com.chs.myvehicleforwatch.domain.repository.SubWayRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class SubwayRepositoryImpl @Inject constructor(
    private val service: MyVehicleService
): SubWayRepository {
    override suspend fun getSearchResultStation(
        query: String
    ): Flow<Resource<List<StationInfo>>> {
        return flow {
            emit(Resource.Loading())
            try {
                val result = service.getSearchResultSubWay(query = query)
                if (result.subwayNameService.result.code == Constants.OPEN_API_RESULT_CODE_SUCCESS) {
                    emit(
                        Resource.Success(result.subwayNameService.row.map { it.toStationInfo() })
                    )
                    return@flow
                } else {
                    emit(Resource.Error(result.subwayNameService.result.message))
                    return@flow
                }
            } catch (e: Exception) {
                emit(Resource.Error(e.message.toString()))
            }
        }
    }

    override suspend fun getStationArrivalInfo(
        stationName: String
    ): Flow<Resource<List<StationArrivalInfo>>> {
        return flow {
            emit(Resource.Loading())
            try {
                val result = service.getArrivalInfoSubWay(stationName = stationName)
                if (result.status != null) {
                    emit(Resource.Error(result.message.toString()))
                    return@flow
                }

                if (result.errorMessage.status == Constants.OPEN_API_SW_RESULT_CODE_SUCCESS) {
                    emit(
                        Resource.Success(
                            result.ArrivalInfoList.map {
                                it.toStationArrivalInfo()
                            }
                        )
                    )
                    return@flow
                }
            } catch (e: Exception) {
                emit(Resource.Error(e.message.toString()))
            }
        }
    }
}