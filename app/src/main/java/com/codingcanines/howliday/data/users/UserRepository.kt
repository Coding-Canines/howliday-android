package com.codingcanines.howliday.data.users

interface UserRepository {
    suspend fun signInWithEmailAndPassword(email: String, password: String)
}
