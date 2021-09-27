package com.egiwon.unsplashandroid

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.egiwon.domain.usecase.GetRandomImageUseCase
import com.egiwon.unsplashandroid.vo.PhotoVO
import com.egiwon.unsplashandroid.vo.PhotoVO.Companion.toPhotoVO
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val useCase: GetRandomImageUseCase
) : ViewModel() {

    private val _photo = MutableLiveData<PhotoVO>()
    val photo: LiveData<PhotoVO> get() = _photo

    fun getRandomImage() = viewModelScope.launch {
        _photo.value = useCase.getRandomImage().toPhotoVO()
    }
}
