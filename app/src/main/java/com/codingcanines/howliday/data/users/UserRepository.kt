package com.codingcanines.howliday.data.users

import kotlinx.coroutines.flow.Flow

interface UserRepository {
    val userData: Flow<UserData?>

    suspend fun signInWithEmailAndPassword(email: String, password: String)
}
