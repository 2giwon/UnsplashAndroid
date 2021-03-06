package com.egiwon.data.di

import com.egiwon.data.ImageDataSource
import com.egiwon.data.ImageDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class DataSourceModule {

    @Binds
    @Singleton
    abstract fun bindImageDataSource(imageDataSource: ImageDataSourceImpl): ImageDataSource
}
