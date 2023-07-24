package com.chs.myvehicleforwatch.data.db.entity

import androidx.room.Entity

@Entity(
    tableName = "vehicle",
    primaryKeys = ["vehicleName", "vehicleCode"]
)
data class VehicleEntity(
    val vehicleName: String,
    val vehicleCode: String,
    val vehicleType: String
)
