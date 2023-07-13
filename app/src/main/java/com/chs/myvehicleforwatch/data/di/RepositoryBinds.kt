package com.chs.myvehicleforwatch.data.di

import com.chs.myvehicleforwatch.data.repository.SubwayRepositoryImpl
import com.chs.myvehicleforwatch.domain.repository.SubWayRepository
import dagger.Binds
import dagger.BindsInstance
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryBinds {
    @Binds
    abstract fun bindSubWayRepository(
        subwayRepositoryImpl: SubwayRepositoryImpl
    ): SubWayRepository
}