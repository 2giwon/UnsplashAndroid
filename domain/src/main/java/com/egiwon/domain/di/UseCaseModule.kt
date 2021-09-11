package com.egiwon.domain.di

import com.egiwon.domain.ImageRepository
import com.egiwon.domain.usecase.GetRandomImageUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class UseCaseModule {

    @Binds
    @Singleton
    abstract fun bindGetRandomImageUseCase(repository: ImageRepository): GetRandomImageUseCase
}
