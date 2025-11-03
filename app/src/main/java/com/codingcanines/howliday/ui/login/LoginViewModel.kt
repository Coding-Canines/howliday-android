package com.codingcanines.howliday.ui.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.codingcanines.howliday.data.users.UserRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class LoginViewModel(private val userRepository: UserRepository) : ViewModel() {
    private val _uiState = MutableStateFlow(LoginFormUiState())
    val uiState = _uiState.asStateFlow()

    fun updateEmail(email: String) {
        _uiState.update {
            it.copy(email = email)
        }
    }

    fun updatePassword(password: String) {
        _uiState.update {
            it.copy(password = password)
        }
    }

    fun loginUser() {
        val form = _uiState.value

        viewModelScope.launch {
            userRepository.signInWithEmailAndPassword(form.email, form.password)
        }
    }
}

data class LoginFormUiState(
    val email: String = "",
    val password: String = ""
)
