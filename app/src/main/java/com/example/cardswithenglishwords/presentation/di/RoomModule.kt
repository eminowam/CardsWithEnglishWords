package com.example.cardswithenglishwords.presentation.di

import androidx.room.Room
import com.example.cardswithenglishwords.data.storage.WordDataBase
import org.koin.dsl.module

const val APP_DATABASE_NAME = "application_database"

val roomModule = module {

    single {
        Room.databaseBuilder(get(), WordDataBase::class.java, APP_DATABASE_NAME)
            .fallbackToDestructiveMigration()
            .build()
    }
    single { get<WordDataBase>().wordDao() }
}