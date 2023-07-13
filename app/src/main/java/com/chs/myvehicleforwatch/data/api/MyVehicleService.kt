package com.chs.myvehicleforwatch.data.api

import com.chs.myvehicleforwatch.common.Constants
import com.chs.myvehicleforwatch.data.api.dto.ResponseSearchResultSubWay
import com.chs.myvehicleforwatch.data.api.dto.ResponseStationArrival
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MyVehicleService @Inject constructor(
    private val client: HttpClient
) {
    suspend fun getSearchResultSubWay(
        query: String,
        page: Int = 0,
    ): ResponseSearchResultSubWay {
        return client.get(
            "${Constants.OPEN_API_SEARCH_SUBWAY_URL}/$page/10/$query"
        ).body()
    }

    suspend fun getArrivalInfoSubWay(
        stationName: String,
        page: Int = 0,
    ): ResponseStationArrival {
        return client.get(
            "${Constants.OPEN_API_SW_REAL_TIME_STATION_ARRIVAL_URL}/$page/10/$stationName"
        ).body()
    }

    suspend fun getSearchResultBus(busNumber: String) {

    }

    suspend fun getArrivalInfoBus(busNumber: String) {

    }
}