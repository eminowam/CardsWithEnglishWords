package com.example.cardswithenglishwords.data.storage

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.cardswithenglishwords.data.models.WordStorage
import com.example.cardswithenglishwords.presentation.fragments.AddWordFragment

private const val DB_NAME = "word_item.db"

@Database(entities = [WordStorage::class], version = 1)
abstract class WordDataBase : RoomDatabase() {
    abstract fun wordDao(): WordDao

    companion object {
        @Volatile
        private var INSTANCE: WordDataBase? = null

        fun getInstance(context: Context): WordDataBase {
            return INSTANCE ?: synchronized(this) {

                val db = Room.databaseBuilder(
                    context.applicationContext,
                    WordDataBase::class.java,
                    DB_NAME
                ).build()
                INSTANCE = db
                db
            }
        }
    }

}
