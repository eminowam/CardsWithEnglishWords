package com.example.cardswithenglishwords.data.storage

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.cardswithenglishwords.data.models.WordStorage
import kotlinx.coroutines.flow.Flow
@Dao

interface WordDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun insert(word: WordStorage)

    @Query("SELECT * FROM words")
     fun getAllWords(): List<WordStorage>

//    @Query("SELECT * FROM words WHERE id")
//     fun getWordById(wordId: WordStorage): WordStorage

}