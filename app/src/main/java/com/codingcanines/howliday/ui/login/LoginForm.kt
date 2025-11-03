package com.codingcanines.howliday.ui.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.codingcanines.howliday.ui.AppViewModelProvider

@Composable
fun LoginForm(
    modifier: Modifier = Modifier,
    viewModel: LoginViewModel = viewModel(factory = AppViewModelProvider.Factory)
) {
    val loginFormValue by viewModel.uiState.collectAsState()

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(32.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(Color(0, 0, 120, 10))
            .padding(32.dp),
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

        Button(onClick = viewModel::loginUser) {
            Text("Login")
        }
    }
}
