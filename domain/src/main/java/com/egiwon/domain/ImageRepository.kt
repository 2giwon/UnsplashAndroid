package com.egiwon.domain

import com.egiwon.domain.entity.Image

interface ImageRepository {
    suspend fun fetchRandomImage(): Image
}
