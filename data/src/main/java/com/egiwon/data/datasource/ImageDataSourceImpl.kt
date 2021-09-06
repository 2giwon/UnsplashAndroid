package com.egiwon.data.datasource

import com.egiwon.data.ImageDataSource
import com.egiwon.data.api.RetrofitApi
import com.egiwon.data.response.RandomImageResponse

internal class ImageDataSourceImpl : ImageDataSource {
    override suspend fun fetchRandomImages(): RandomImageResponse {
        return RetrofitApi
            .randomImageService
            .fetchRandomImage()
    }
}
