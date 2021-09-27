package com.egiwon.domain.usecase

import com.egiwon.domain.ImageRepository
import com.egiwon.domain.model.PhotoData

class GetRandomImageUseCase(
    private val imageRepository: ImageRepository
) {
    suspend fun getRandomImage(): PhotoData {
        return imageRepository.fetchRandomImage()
    }
}
