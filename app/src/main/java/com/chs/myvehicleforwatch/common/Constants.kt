package com.chs.myvehicleforwatch.common

import com.chs.myvehicleforwatch.BuildConfig

object Constants {
    private const val OPEN_API_KEY: String = BuildConfig.OPEN_API_KEY
    const val BUS_API_KEY: String = BuildConfig.BUS_API_KEY

    private const val OPEN_API_BASE_URL: String = "http://openapi.seoul.go.kr:8088/$OPEN_API_KEY/json"
    private const val OPEN_API_SW_BASE_URL: String = "http://swopenapi.seoul.go.kr/api/subway/$OPEN_API_KEY/json"
    const val OPEN_API_SEARCH_SUBWAY_URL = "$OPEN_API_BASE_URL/SearchInfoBySubwayNameService"
    const val OPEN_API_SW_REAL_TIME_STATION_ARRIVAL_URL = "$OPEN_API_SW_BASE_URL/realtimeStationArrival"

    const val OPEN_API_RESULT_CODE_SUCCESS: String = "INFO-000"
    const val OPEN_API_SW_RESULT_CODE_ERROR: Int = 500
    const val OPEN_API_SW_RESULT_CODE_SUCCESS: Int = 200


    private const val BUS_API_BASE_URL: String = "http://ws.bus.go.kr/api/rest"
    const val BUS_API_BUS_ROUTE_API: String = "$BUS_API_BASE_URL/bugRouteInfo"
    const val BUS_API_ARRIVE_API: String = "$BUS_API_BASE_URL/arrive"
}