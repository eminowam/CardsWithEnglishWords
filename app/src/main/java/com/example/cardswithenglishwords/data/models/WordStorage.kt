package com.example.cardswithenglishwords.data.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "words")
 class WordStorage(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    @ColumnInfo var englishWord: String,
    @ColumnInfo var translation: String
)
