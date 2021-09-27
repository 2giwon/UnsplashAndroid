package com.egiwon.unsplashandroid.ext

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("urlToGlide")
fun ImageView.urlToGlide(url: String) {
    Glide.with(this)
        .load(url)
        .into(this)
}