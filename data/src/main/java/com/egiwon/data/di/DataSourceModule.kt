package com.egiwon.data.di

import com.egiwon.data.ImageDataSource
import com.egiwon.data.datasource.ImageDataSourceImpl
import com.egiwon.data.datasource.RandomImageService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {

    @Provides
    @Singleton
    fun provideImageDataSource(randomImageService: RandomImageService): ImageDataSource =
        ImageDataSourceImpl(randomImageService)
}
