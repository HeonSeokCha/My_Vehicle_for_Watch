package com.chs.myvehicleforwatch.data.db.entity

import androidx.room.Entity

@Entity(
    tableName = "favorite_vehicle",
    primaryKeys = ["vehicleName", "vehicleCode"]
)
data class FavoriteVehicleEntity(
    val vehicleName: String,
    val vehicleCode: String,
    val vehicleType: String
)
