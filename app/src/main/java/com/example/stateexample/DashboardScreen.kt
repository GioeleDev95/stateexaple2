package com.example.stateexample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DashBoardScreen(viewModel: DashBoardViewModel) {

    val dashBoardState by viewModel.uiState.collectAsState()


    Column(modifier = Modifier.fillMaxSize().background(Color.White)) {
        Text(
            text = "${dashBoardState.title}",
            fontSize = 20.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(16.dp)
        )

        Button(onClick = {viewModel.changeTitle()}) {
            Text(
                text = "CHANGE")
        }
    }
}

