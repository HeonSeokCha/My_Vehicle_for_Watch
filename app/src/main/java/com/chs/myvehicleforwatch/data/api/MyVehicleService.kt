package com.chs.myvehicleforwatch.data.api

import android.util.Log
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MyVehicleService @Inject constructor(
    private val service: HttpClient
) {
    suspend fun getSearchResultSubWay(stationName: String) {

    }

    suspend fun getArrivalInfoSubWay(stationName: String) {

    }

    suspend fun getSearchResultBus(busNumber: String) {

    }

    suspend fun getArrivalInfoBus(busNumber: String)
}