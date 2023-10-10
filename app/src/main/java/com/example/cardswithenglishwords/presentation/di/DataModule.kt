package com.example.cardswithenglishwords.presentation.di

import com.example.cardswithenglishwords.data.mapper.MapFromListOfWordStorageToListOfWord
import com.example.cardswithenglishwords.data.mapper.MapFromWordStorageToWord
import com.example.cardswithenglishwords.data.mapper.MapFromWordToWordStorage
import com.example.cardswithenglishwords.data.repository.RepositoryImpl
import com.example.cardswithenglishwords.domain.repository.WordRepository
import org.koin.dsl.module

val dataModule = module {
    single<WordRepository> {
        RepositoryImpl(
            dao = get(),
            mapFromListOfWordStorageToListOfWord = MapFromListOfWordStorageToListOfWord
                (mapFromWordStorageToWord = MapFromWordStorageToWord()),
            mapFromWordToWordStorage = MapFromWordToWordStorage(),
        )
    }
}