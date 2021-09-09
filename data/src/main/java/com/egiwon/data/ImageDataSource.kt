package com.egiwon.data

import com.egiwon.data.response.RandomImageResponse

interface ImageDataSource {
    suspend fun fetchRandomImages(): RandomImageResponse
}
