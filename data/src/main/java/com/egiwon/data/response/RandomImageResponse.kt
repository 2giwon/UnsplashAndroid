package com.egiwon.data.response

import com.egiwon.domain.model.PhotoData
import com.google.gson.annotations.SerializedName

internal data class RandomImageResponse(
    @SerializedName("description")
    val description: Any = Any(),
    @SerializedName("id")
    val id: String = "",
    @SerializedName("liked_by_user")
    val likedByUser: Boolean = false,
    @SerializedName("likes")
    val likes: Int = 0,
    @SerializedName("urls")
    val urls: Urls = Urls(),
    @SerializedName("views")
    val views: Int = 0,
    @SerializedName("width")
    val width: Int = 0,
    @SerializedName("height")
    val height: Int = 0
) : DataToDomainMapper<PhotoData> {
    override fun toDomain(): PhotoData {
        return PhotoData(
            id = id,
            likes = likes,
            fullImageUrl = urls.full,
            regularImageUrl = urls.regular,
            smallImageUrl = urls.small,
            thumb = urls.thumb,
            views = views,
            width = width,
            height = height
        )
    }
}

