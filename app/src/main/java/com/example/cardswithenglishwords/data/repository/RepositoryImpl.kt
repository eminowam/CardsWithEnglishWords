package com.example.cardswithenglishwords.data.repository

import com.example.cardswithenglishwords.data.models.WordStorage
import com.example.cardswithenglishwords.data.storage.WordDao
import com.example.cardswithenglishwords.domain.Mapper
import com.example.cardswithenglishwords.domain.models.Word
import com.example.cardswithenglishwords.domain.repository.WordRepository

class RepositoryImpl(
    private val dao: WordDao,
    private val mapFromListOfWordStorageToListOfWord: Mapper<List<WordStorage>, List<Word>>,
    private val mapFromWordToWordStorage: Mapper<Word, WordStorage>
) : WordRepository {
    override suspend fun getAllWords(): List<Word> =
        mapFromListOfWordStorageToListOfWord.map(dao.getAllWords())

    override suspend fun getWordsById(word: Word) =
        dao.getWordById(mapFromWordToWordStorage.map(word))

}