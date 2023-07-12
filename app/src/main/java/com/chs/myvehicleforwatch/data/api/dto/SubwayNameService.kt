package com.chs.myvehicleforwatch.data.api.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SubwayNameService(
    @SerialName("list_total_count")
    val listTotalCount: Int,
    @SerialName("RESULT")
    val result: SubwayNameServiceResult,
    @SerialName("row")
    val row: List<SubwayNameServiceStationInfo>
)
