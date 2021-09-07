package com.egiwon.data.datasource

import com.egiwon.data.response.RandomImageResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface RandomImageService {

    @GET("/photos/random")
    suspend fun fetchRandomImage(): RandomImageResponse
}
