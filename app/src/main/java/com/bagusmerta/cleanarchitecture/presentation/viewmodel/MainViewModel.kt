package com.bagusmerta.cleanarchitecture.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bagusmerta.cleanarchitecture.domain.model.TextEntity
import com.bagusmerta.cleanarchitecture.domain.usecase.TextUseCase

class MainViewModel(private val textUseCase: TextUseCase): ViewModel() {
    private val _text = MutableLiveData<TextEntity>()

    val text: LiveData<TextEntity> get() = _text
    fun setTextMessage(message: String){
        _text.value = textUseCase.getText(message)
    }
}