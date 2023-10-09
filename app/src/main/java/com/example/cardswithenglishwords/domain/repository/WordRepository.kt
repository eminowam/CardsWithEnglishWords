package com.example.cardswithenglishwords.domain.repository

import com.example.cardswithenglishwords.data.models.WordStorage
import com.example.cardswithenglishwords.domain.models.Word

interface WordRepository {
    suspend fun getAllWords(): List<Word>
    suspend fun getWordsById(word: Word): WordStorage?
}