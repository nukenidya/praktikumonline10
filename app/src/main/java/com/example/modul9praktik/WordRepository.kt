package com.example.modul9praktik

import androidx.lifecycle.LiveData

class WordRepository (private val wordDao: WordDAO) {
    val allWords: LiveData<List<Word>> = wordDao.getAlphabetizedWords()
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}