package com.chs.myvehicleforwatch.data.api

import android.util.Log
import com.chs.myvehicleforwatch.common.Constants
import com.chs.myvehicleforwatch.data.api.dto.ResponseSearchResultSubWay
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter
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
            "${Constants.OPEN_API_SEARCH_SUBWAY_URL}/$page/5/$query"
        ).body()
    }

    suspend fun getArrivalInfoSubWay(
        stationName: String,
        page: Int
    ) {
        client.get(Constants.OPEN_API_SW_REAL_TIME_STATION_ARRIVAL_URL)
    }

    suspend fun getSearchResultBus(busNumber: String) {

    }

    suspend fun getArrivalInfoBus(busNumber: String) {

    }
}