package com.egiwon.data.api

import com.egiwon.data.datasource.RandomImageService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitApi {
    private val httpLoggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    private val gsonConverterFactory: GsonConverterFactory = GsonConverterFactory.create()

    private val httpClient = OkHttpClient.Builder()
        .addInterceptor(httpLoggingInterceptor)
        .build()

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://api.unsplash.com/")
        .client(httpClient)
        .addConverterFactory(gsonConverterFactory)
        .build()

    val randomImageService: RandomImageService = retrofit.create(RandomImageService::class.java)
}
