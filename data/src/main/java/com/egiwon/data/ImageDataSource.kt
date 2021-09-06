package com.egiwon.data

import com.egiwon.data.response.RandomImageResponse

internal interface ImageDataSource {
    suspend fun fetchRandomImages(): RandomImageResponse
}
