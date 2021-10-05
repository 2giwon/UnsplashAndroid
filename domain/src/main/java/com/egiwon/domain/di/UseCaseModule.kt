package com.egiwon.domain.di

import com.egiwon.domain.ImageRepository
import com.egiwon.domain.usecase.GetRandomImageUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal class UseCaseModule {

    @Provides
    @Singleton
    fun providesGetRandomImageUseCase(imageRepository: ImageRepository): GetRandomImageUseCase {
        return GetRandomImageUseCase(imageRepository)
    }
}
