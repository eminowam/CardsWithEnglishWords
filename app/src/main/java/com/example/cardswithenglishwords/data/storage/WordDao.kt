package com.example.cardswithenglishwords.data.storage

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.cardswithenglishwords.data.models.WordStorage

@Dao

interface WordDao {
    @Insert
    suspend fun insert(word: WordStorage)

    @Query("SELECT * FROM words")
    suspend fun getAllWords(): List<WordStorage>

    @Query("SELECT * FROM words WHERE id = :id")
    suspend fun getWordById(id: WordStorage): WordStorage?

}