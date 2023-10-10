package com.example.cardswithenglishwords.domain

interface Mapper<From, To> {
    fun map(from: From): To

}