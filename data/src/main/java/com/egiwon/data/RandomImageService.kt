package com.egiwon.data

import com.egiwon.data.response.RandomImageResponse
import retrofit2.http.GET

internal interface RandomImageService {

    @GET("/photos/random")
    suspend fun fetchRandomImage(): RandomImageResponse
}
