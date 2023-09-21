package com.chs.myvehicleforwatch.data.db

import androidx.room.Delete
import androidx.room.Insert

interface BaseDao<T> {
    @Insert
    suspend fun insert(entity: T)

    @Delete
    suspend fun delete(entity: T)
}