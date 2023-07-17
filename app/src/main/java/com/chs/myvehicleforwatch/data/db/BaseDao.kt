package com.chs.myvehicleforwatch.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert

@Dao
interface BaseDao<T> {
    @Insert
    suspend fun<T> insert()

    @Delete
    suspend fun<T> delete(entity: T)
}