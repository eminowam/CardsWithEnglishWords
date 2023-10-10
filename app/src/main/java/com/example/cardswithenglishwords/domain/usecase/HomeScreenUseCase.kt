package com.example.cardswithenglishwords.domain.usecase

import android.content.Context
import com.example.cardswithenglishwords.data.repository.RepositoryImpl
import com.example.cardswithenglishwords.domain.models.Word

class HomeScreenUseCase(private val repository: RepositoryImpl) {
    suspend operator fun invoke(word: Word) = repository.getWordsById(word)

}