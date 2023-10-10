package com.example.cardswithenglishwords.domain.usecase

import com.example.cardswithenglishwords.data.models.WordStorage
import com.example.cardswithenglishwords.data.repository.RepositoryImpl
import com.example.cardswithenglishwords.domain.repository.WordRepository

class ListUseCase(private val repository: RepositoryImpl) {
    suspend operator fun invoke() = repository.getAllWords()
}