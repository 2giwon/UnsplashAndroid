package com.egiwon.data.datasource

import com.egiwon.data.ImageDataSource
import com.egiwon.data.response.RandomImageResponse
import javax.inject.Inject

internal class ImageDataSourceImpl @Inject constructor(
    private val randomImageService: RandomImageService
) : ImageDataSource {
    override suspend fun fetchRandomImages(): RandomImageResponse {
        return randomImageService.fetchRandomImage()
    }
}
