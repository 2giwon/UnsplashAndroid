package com.egiwon.data

import com.egiwon.data.response.mapToImage
import com.egiwon.domain.ImageRepository
import com.egiwon.domain.model.PhotoData
import javax.inject.Inject

internal class ImageRepositoryImpl @Inject constructor(
    private val imageDataSource: ImageDataSource
) : ImageRepository {

    override suspend fun fetchRandomImage(): PhotoData {
        return imageDataSource.fetchRandomImages().mapToImage()
    }

}
