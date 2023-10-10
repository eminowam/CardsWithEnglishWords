package com.example.cardswithenglishwords.presentation.di

import com.example.cardswithenglishwords.domain.usecase.HomeScreenUseCase
import com.example.cardswithenglishwords.domain.usecase.ListUseCase
import org.koin.dsl.module

val domainModule = module {
    factory {
        HomeScreenUseCase(
            repository = get()
        )
    }
    factory {
        ListUseCase(
            repository = get())
    }
}