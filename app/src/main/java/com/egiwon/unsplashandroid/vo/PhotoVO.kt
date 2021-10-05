package com.egiwon.unsplashandroid.vo

import com.egiwon.domain.model.PhotoData

data class PhotoVO(
    val id: String = "",
    val likes: Int = 0,
    val fullImageUrl: String = "",
    val regularImageUrl: String = "",
    val smallImageUrl: String = "",
    val thumb: String = "",
    val views: Int = 0,
    val width: Int = 0,
    val height: Int = 0
) {
    companion object {
        fun PhotoData.toPhotoVO(): PhotoVO {
            return PhotoVO(
                id = id,
                likes = likes,
                fullImageUrl = fullImageUrl,
                regularImageUrl = regularImageUrl,
                smallImageUrl = smallImageUrl,
                thumb = thumb,
                views = views,
                width = width,
                height = height
            )
        }
    }
}

