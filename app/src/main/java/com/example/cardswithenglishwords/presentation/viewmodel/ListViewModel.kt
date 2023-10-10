package com.example.cardswithenglishwords.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cardswithenglishwords.domain.models.Word
import com.example.cardswithenglishwords.domain.usecase.ListUseCase
import kotlinx.coroutines.launch

class ListViewModel(
    private val getAllWordsUseCase: ListUseCase
) : ViewModel() {

    private val _word: MutableLiveData<List<Word>> = MutableLiveData()
    val word: LiveData<List<Word>> get() = _word

    fun getAllWords() = viewModelScope.launch {
        kotlin.runCatching {
            getAllWordsUseCase.invoke()
        }.onSuccess {
            _word.value = it
        }
    }
}