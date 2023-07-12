package com.chs.myvehicleforwatch.data.api.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SubwayNameServiceStationInfo(
    @SerialName("STATION_CD")
    val stationCode: String,
    @SerialName("STATION_NM")
    val stationName: String,
    @SerialName("LINE_NUM")
    val lineNumber: String
)
