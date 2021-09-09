package com.egiwon.data

import com.egiwon.data.response.mapToImage
import com.egiwon.domain.ImageRepository
import com.egiwon.domain.entity.Image
import javax.inject.Inject

internal class ImageRepositoryImpl @Inject constructor(
    private val imageDataSource: ImageDataSource
) : ImageRepository {

    override suspend fun fetchRandomImage(): Image {
        return imageDataSource.fetchRandomImages().mapToImage()
    }

}
