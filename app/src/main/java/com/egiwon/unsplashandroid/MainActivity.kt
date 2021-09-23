package com.egiwon.unsplashandroid

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.egiwon.unsplashandroid.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.fabRandomImage.setOnClickListener {
            viewModel.getRandomImage()
        }

        viewModel.getRandomImage()
        setObserve()
    }

    private fun setObserve() {
        viewModel.image.observe(this) {
            Glide.with(binding.ivImage)
                .load(it.smallImageUrl)
                .into(binding.ivImage)
        }
    }
}
