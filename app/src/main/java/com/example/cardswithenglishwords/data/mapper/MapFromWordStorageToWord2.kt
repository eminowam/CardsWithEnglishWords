package com.example.cardswithenglishwords.data.mapper

import com.example.cardswithenglishwords.data.models.WordStorage
import com.example.cardswithenglishwords.domain.Mapper
import com.example.cardswithenglishwords.domain.models.Word

class MapFromWordToWordStorage : Mapper<Word, WordStorage> {
    override fun map(from: Word) = from.run {
        WordStorage(
            id = id,
            englishWord = englishWord,
            translation = translation
        )
    }
}