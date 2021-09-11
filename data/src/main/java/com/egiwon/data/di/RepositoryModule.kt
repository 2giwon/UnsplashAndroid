package com.egiwon.data.di

import com.egiwon.data.ImageDataSource
import com.egiwon.data.ImageRepositoryImpl
import com.egiwon.domain.ImageRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun provideImageRepository(imageDataSource: ImageDataSource): ImageRepository
}
