package com.chs.myvehicleforwatch.domain.mapper

import com.chs.myvehicleforwatch.data.api.dto.StationArrivalRealTimeArrivalInfo
import com.chs.myvehicleforwatch.data.api.dto.SubwayNameServiceStationInfo
import com.chs.myvehicleforwatch.domain.model.StationArrivalInfo
import com.chs.myvehicleforwatch.domain.model.StationInfo

fun SubwayNameServiceStationInfo.toStationInfo(): StationInfo {
    return StationInfo(
        stationName = this.stationName,
        lineInfo = this.lineNumber
    )
}

fun StationArrivalRealTimeArrivalInfo.toStationArrivalInfo(): StationArrivalInfo {
    return StationArrivalInfo(
        upDownLineInfo = this.updnLine,
        trainLineInfo = this.trainLineNm,
        stationName = this.statnNm,
        secondLeftArrive = this.barvlDt,
        lastStationName = this.bstatnNm,
        primaryMessage = this.arvlMsg2,
        subMessage = this.arvlMsg3
    )
}