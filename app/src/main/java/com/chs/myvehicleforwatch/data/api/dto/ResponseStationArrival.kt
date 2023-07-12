package com.chs.myvehicleforwatch.data.api.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResponseStationArrival(
    @SerialName("errorMessage")
    val errorMessage: StationArrivalErrorMessage
)
