package com.egiwon.data.di

import com.egiwon.data.ImageDataSource
import com.egiwon.domain.ImageRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindImageRepository(imageDataSource: ImageDataSource): ImageRepository
}
