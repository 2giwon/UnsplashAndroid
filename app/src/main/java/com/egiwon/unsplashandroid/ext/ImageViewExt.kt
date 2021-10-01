package com.egiwon.unsplashandroid.ext

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("app:urlToGlide")
fun urlToGlide(imageView: ImageView, url: String?) {
    if (!url.isNullOrEmpty()) {
        Glide.with(imageView)
            .load(url)
            .into(imageView)
    }
}
