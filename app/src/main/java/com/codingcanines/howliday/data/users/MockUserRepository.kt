package com.codingcanines.howliday.data.users

import android.util.Log

private const val TAG = "MockUserRepository"

class MockUserRepository : UserRepository {
    override suspend fun signInWithEmailAndPassword(email: String, password: String) {
        Log.d(TAG, "Email: $email Password: $password")
    }
}
