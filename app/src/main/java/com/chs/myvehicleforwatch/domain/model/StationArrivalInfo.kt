package com.chs.myvehicleforwatch.domain.model

data class StationArrivalInfo(
    val upDownLineInfo: String,
    val trainLineInfo: String,
    val stationName: String,
    val secondLeftArrive: Int,
    val lastStationName: String,
    val primaryMessage: String,
    val subMessage: String
)
