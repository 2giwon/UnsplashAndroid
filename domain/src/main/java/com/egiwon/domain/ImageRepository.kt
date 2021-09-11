package com.egiwon.domain

import com.egiwon.domain.model.PhotoData

interface ImageRepository {
    suspend fun fetchRandomImage(): PhotoData
}
