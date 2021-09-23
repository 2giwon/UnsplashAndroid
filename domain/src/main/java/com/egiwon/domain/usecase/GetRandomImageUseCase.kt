package com.egiwon.domain.usecase

import com.egiwon.domain.ImageRepository
import com.egiwon.domain.model.PhotoData
import javax.inject.Inject

class GetRandomImageUseCase (
    private val imageRepository: ImageRepository
) {
    suspend fun getRandomImage(): PhotoData {
        return imageRepository.fetchRandomImage()
    }
}
