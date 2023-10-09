package com.example.cardswithenglishwords

import android.app.Application
import com.example.cardswithenglishwords.presentation.di.dataModule
import com.example.cardswithenglishwords.presentation.di.domainModule
import com.example.cardswithenglishwords.presentation.di.networkModule
import com.example.cardswithenglishwords.presentation.di.presentationModule
import com.example.cardswithenglishwords.presentation.di.roomModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(
                listOf(
                    dataModule,
                    domainModule,
                    presentationModule,
                    roomModule,
                    networkModule
                )
            )
        }
    }
}