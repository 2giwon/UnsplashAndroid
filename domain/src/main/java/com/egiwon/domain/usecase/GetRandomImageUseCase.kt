package com.egiwon.domain.usecase

import com.egiwon.domain.ImageRepository
import com.egiwon.domain.entity.Image
import javax.inject.Inject

class GetRandomImageUseCase @Inject constructor(
    private val imageRepository: ImageRepository
) {
    suspend fun getRandomImage(): Image {
        return imageRepository.fetchRandomImage()
    }
}
