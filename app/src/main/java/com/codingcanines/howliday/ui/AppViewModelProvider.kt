package com.codingcanines.howliday.ui

import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.codingcanines.howliday.HowlidayApplication
import com.codingcanines.howliday.ui.login.LoginViewModel

object AppViewModelProvider {
    val Factory = viewModelFactory {
        initializer {
            LoginViewModel(userRepository = howlidayApplication().container.userRepository)
        }
    }
}

fun CreationExtras.howlidayApplication(): HowlidayApplication =
    (this[APPLICATION_KEY] as HowlidayApplication)
