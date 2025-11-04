package com.codingcanines.howliday.data.users

import android.util.Log
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

private const val TAG = "LocalUserRepository"

class LocalUserRepository : UserRepository {
    private val _userData = MutableStateFlow<UserData?>(null)

    override val userData: Flow<UserData?> = _userData.asStateFlow()

    override suspend fun signInWithEmailAndPassword(email: String, password: String) {
        Log.d(TAG, "Email: $email Password: $password")
        _userData.value = UserData(email)
    }
}
