package com.chs.myvehicleforwatch.data.api.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StationArrivalErrorMessage(
    @SerialName("status")
    val status: Int? = null,
    @SerialName("code")
    val code: String? = null,
    @SerialName("message")
    val message: String? = null,
)
