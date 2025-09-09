package com.codingcanines.howliday.ui.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun LoginForm(
    modifier: Modifier = Modifier,
    viewModel: LoginViewModel = viewModel()
) {
    val loginFormValue by viewModel.uiState.collectAsState()

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(32.dp)
            .background(Color(255f, 255f, 255f, 0.2f)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Login")

        TextField(
            value = loginFormValue.email,
            onValueChange = viewModel::updateEmail
        )

        TextField(
            value = loginFormValue.password,
            onValueChange = viewModel::updatePassword
        )

        Button(onClick = {}) {
            Text("Login")
        }
    }
}
