package com.egiwon.data.response

import com.google.gson.annotations.SerializedName

data class RandomImageResponse(
    @SerializedName("description")
    val description: Any,
    @SerializedName("id")
    val id: String,
    @SerializedName("liked_by_user")
    val likedByUser: Boolean,
    @SerializedName("likes")
    val likes: Int,
    @SerializedName("urls")
    val urls: Urls,
    @SerializedName("views")
    val views: Int,
    @SerializedName("width")
    val width: Int,
    @SerializedName("height")
    val height: Int
)
