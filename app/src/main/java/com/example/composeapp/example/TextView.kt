package com.example.composeapp.example

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TextView() {
    val text = "Hello, Jetpack Compose!"
    Text(text = text, modifier = Modifier.padding(16.dp))
}

@Preview
@Composable
fun TextViewPreview() {
    TextView()
}