package com.moonrise.app.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField


import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

/**
 * @Created by akash on 8/4/2023.
 * Know more about author on <a href="https://akash.cloudemy.in">...</a>
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier.fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.height(48.dp))
        Text(
            text = "MOONRISE",
            color = Color.White,
            style = MaterialTheme.typography.headlineLarge
        )
        Spacer(Modifier.height(32.dp))
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = MaterialTheme.shapes.medium,
        ) {
            Text(
                modifier = Modifier.padding(horizontal = 16.dp)
                    .padding(top = 16.dp),
                text = "Welcome back",
                color = Color.Black,
                style = MaterialTheme.typography.headlineSmall
            )
            Spacer(Modifier.height(16.dp))
            EmailFieldBox()
            Spacer(Modifier.height(16.dp))
            PasswordFieldBox()
            Spacer(Modifier.height(16.dp))
            Button(onClick ={},modifier = Modifier.align(Alignment.CenterHorizontally)){
                Text("Sign In")
            }
            Spacer(Modifier.height(32.dp))
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EmailFieldBox() {
    Text(
        modifier = Modifier.padding(horizontal = 16.dp),
        text = "Email",
        color = MaterialTheme.colorScheme.background,
        style = MaterialTheme.typography.bodyLarge
    )
    Spacer(Modifier.height(8.dp))

    OutlinedTextField(
        modifier = Modifier.padding(horizontal = 16.dp)
            .clip(RoundedCornerShape(8))
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primaryContainer),
        value = "",
        onValueChange = {
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),

        )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordFieldBox() {
    Text(
        modifier = Modifier.padding(horizontal = 16.dp),
        text = "Password",
        color = MaterialTheme.colorScheme.background,
        style = MaterialTheme.typography.bodyLarge
    )
    Spacer(Modifier.height(8.dp))

    OutlinedTextField(
        modifier = Modifier.padding(horizontal = 16.dp)
            .clip(RoundedCornerShape(8))
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primaryContainer),
        value = "",
        onValueChange = {
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),

        )
}