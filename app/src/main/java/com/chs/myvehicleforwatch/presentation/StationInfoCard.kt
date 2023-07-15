package com.chs.myvehicleforwatch.presentation

import androidx.compose.runtime.Composable
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.TitleCard
import com.chs.myvehicleforwatch.domain.model.StationInfo

@Composable
fun StationInfoCard(
    stationInfo: StationInfo,
    onClick: (stationName: String) -> Unit
) {
    TitleCard(
        onClick = { onClick(stationInfo.stationName) },
        title = { Text(text = stationInfo.stationName) }
    ) {
        Text(text = stationInfo.lineInfo)
    }
}