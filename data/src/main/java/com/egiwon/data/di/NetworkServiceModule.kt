package com.egiwon.data.di

import com.egiwon.data.datasource.RandomImageService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkServiceModule {

    @Provides
    @Singleton
    fun provideRandomImageService(retrofit: Retrofit): RandomImageService =
        retrofit.create(RandomImageService::class.java)
}
