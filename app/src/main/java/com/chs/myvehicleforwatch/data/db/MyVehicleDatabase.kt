package com.chs.myvehicleforwatch.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.chs.myvehicleforwatch.data.db.entity.FavoriteVehicleEntity


@Database(
    entities = [
        FavoriteVehicleEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class MyVehicleDatabase : RoomDatabase() {

}