package com.example.cardswithenglishwords.presentation.di

import com.example.cardswithenglishwords.presentation.viewmodel.HomeScreenViewModel
import com.example.cardswithenglishwords.presentation.viewmodel.ListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel {
        HomeScreenViewModel(
            getWordByIdUseCase = get(),
        )
    }

    viewModel {
        ListViewModel(
            getAllWordsUseCase = get()
        )
    }
}