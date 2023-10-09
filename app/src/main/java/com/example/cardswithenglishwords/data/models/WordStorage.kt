package com.example.cardswithenglishwords.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "words")
 class WordStorage(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val englishWord: String,
    val translation: String
)
