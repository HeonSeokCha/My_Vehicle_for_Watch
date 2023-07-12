package com.chs.myvehicleforwatch.data.api.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SubwayNameServiceResult(
    @SerialName("CODE")
    val code: String,
    @SerialName("MESSAGE")
    val message: String
)
