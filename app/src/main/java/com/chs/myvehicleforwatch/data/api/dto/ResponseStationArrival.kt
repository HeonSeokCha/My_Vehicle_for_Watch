package com.chs.myvehicleforwatch.data.api.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResponseStationArrival(
    @SerialName("status")
    val status: Int? = null,
    @SerialName("code")
    val code: String? = null,
    @SerialName("message")
    val message: String? = null,

    @SerialName("errorMessage")
    val errorMessage: StationArrivalErrorMessage,
    @SerialName("realtimeArrivalList")
    val ArrivalInfoList: List<StationArrivalRealTimeArrivalInfo>
)
