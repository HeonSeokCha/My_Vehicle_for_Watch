package com.chs.myvehicleforwatch.data.db

import androidx.room.Dao
import androidx.room.Query
import com.chs.myvehicleforwatch.data.db.entity.VehicleEntity
import kotlinx.coroutines.flow.Flow

@Dao
abstract class VehicleDao : BaseDao<VehicleEntity> {

    @Query("SELECT * FROM vehicle")
    abstract fun getAll(): Flow<List<VehicleEntity>>

}