package com.chs.myvehicleforwatch.data.api.dto

import kotlinx.serialization.Serializable

@Serializable
data class StationArrivalErrorMessage(
    val status: Int,
    val code: String,
    val message: String,
    val link: String,
    val total: Int
)
