package com.chs.myvehicleforwatch.data.api.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StationArrivalRealTimeArrivalInfo(
    @SerialName("updnLine")
    val updnLine: String,
    @SerialName("trainLineNm")
    val trainLineNm: String,
    @SerialName("statnNm")
    val statnNm: String,
    @SerialName("barvlDt")
    val barvlDt: Int,
    @SerialName("bstatnNm")
    val bstatnNm: String,
    @SerialName("arvlMsg2")
    val arvlMsg2: String,
    @SerialName("arvlMsg3")
    val arvlMsg3: String
)