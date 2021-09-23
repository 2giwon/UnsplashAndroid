package com.egiwon.unsplashandroid

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.egiwon.domain.usecase.GetRandomImageUseCase
import com.egiwon.unsplashandroid.vo.PhotoVO
import com.egiwon.unsplashandroid.vo.toPhotoVO
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val useCase: GetRandomImageUseCase
) : ViewModel() {

    private val _image = MutableLiveData<PhotoVO>()
    val image: LiveData<PhotoVO> get() = _image

    fun getRandomImage() = viewModelScope.launch {
        _image.value = useCase.getRandomImage().toPhotoVO()
    }
}
