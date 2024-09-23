package com.example.composeapp.example

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun TextStyleExample() {
    Column {
        // FontSize
        Text(text = "Hello!", fontSize = 25.sp)
        // 16 Color
        Text(text = "Hello!", color = Color(0xFF00FF00))
        // RGB Color
        Text(text = "Hello!", color = Color(0, 0, 255))
    }
}