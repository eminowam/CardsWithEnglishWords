package com.example.cardswithenglishwords.data.mapper

import com.example.cardswithenglishwords.data.models.WordStorage
import com.example.cardswithenglishwords.domain.Mapper
import com.example.cardswithenglishwords.domain.models.Word

class MapFromWordStorageToWord : Mapper<WordStorage, Word> {
    override fun map(from: WordStorage) = from.run {
        Word(
            id = id,
            englishWord = englishWord,
            translation = translation
        )
    }
}

class MapFromListOfWordStorageToListOfWord(
    private val mapFromWordStorageToWord: MapFromWordStorageToWord
) : Mapper<List<WordStorage>, List<Word>> {
    override fun map(from: List<WordStorage>) = from.map {
        mapFromWordStorageToWord.map(it)
    }

}