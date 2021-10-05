package com.egiwon.unsplashandroid

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.egiwon.unsplashandroid.databinding.ActivityMainBinding
import com.egiwon.unsplashandroid.ext.urlToGlide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main).apply {
            lifecycleOwner = this@MainActivity
        }
        binding.vm = viewModel

        fetchRandomImage()
        setObserve()
    }

    private fun fetchRandomImage() {
        viewModel.getRandomImage()
    }

    private fun setObserve() {
        viewModel.errorMessage.observe(this, {
            Toast.makeText(this, it, Toast.LENGTH_LONG).show()
        })
    }
}
