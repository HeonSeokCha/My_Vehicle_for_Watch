package com.chs.myvehicleforwatch.data.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.chs.myvehicleforwatch.data.api.MyVehicleService
import com.chs.myvehicleforwatch.data.db.MyVehicleDatabase
import com.chs.myvehicleforwatch.data.db.VehicleDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.DEFAULT
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object Module {

    @Singleton
    @Provides
    fun provideKtorHttpClient(): MyVehicleService {
        return MyVehicleService(
            HttpClient(Android) {
                install(Logging) {
                    logger = Logger.DEFAULT
                    level = LogLevel.ALL
                }
                install(ContentNegotiation) {
                    json(Json {
                        ignoreUnknownKeys = true
                    })
                }
            }
        )
    }

    @Singleton
    @Provides
    fun provideMyVehicleDatabase(@ApplicationContext app: Context): MyVehicleDatabase {
        return Room.databaseBuilder(
            app,
            MyVehicleDatabase::class.java,
            "my_vehicle_db"
        ).build()
    }

    @Singleton
    @Provides
    fun provideVehicleDao(db: MyVehicleDatabase): VehicleDao {
        return db.vehicleDao
    }
}