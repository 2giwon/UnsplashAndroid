package com.egiwon.domain.usecase

import com.egiwon.domain.ImageRepository
import com.egiwon.domain.model.PhotoData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GetRandomImageUseCase(
    private val imageRepository: ImageRepository
) {
    suspend fun getRandomImage(): Result<PhotoData> = withContext(Dispatchers.IO) {
        runCatching { imageRepository.fetchRandomImage() }
    }
}
