package com.example.cardswithenglishwords.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cardswithenglishwords.domain.models.Word
import com.example.cardswithenglishwords.domain.usecase.HomeScreenUseCase
import kotlinx.coroutines.launch

class HomeScreenViewModel(
    private val getWordByIdUseCase: HomeScreenUseCase
) : ViewModel() {

    private val _wordById: MutableLiveData<Word> = MutableLiveData()
    val wordById: LiveData<Word> get() = _wordById

    fun getWordById(word: Word) = viewModelScope.launch {
        getWordByIdUseCase.invoke(word)
    }
}