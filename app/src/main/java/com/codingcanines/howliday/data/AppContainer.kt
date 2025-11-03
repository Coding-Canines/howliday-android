package com.codingcanines.howliday.data

import com.codingcanines.howliday.data.users.MockUserRepository
import com.codingcanines.howliday.data.users.UserRepository

interface AppContainer {
    val userRepository: UserRepository
}

class AppDataContainer : AppContainer {
    override val userRepository: UserRepository by lazy {
        MockUserRepository()
    }
}
