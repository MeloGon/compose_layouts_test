package com.example.mynewcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun TestComplexLayoutExercise() {
    ComplexLayoutExercise()
}

@Composable
fun ComplexLayoutExercise(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())) {
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan), contentAlignment = Alignment.Center){ Text("Ejemplo 1") }
        Spacer(modifier = Modifier.height(30.dp))
        Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
            Box (Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .weight(1f)
                .background(Color.Red), contentAlignment = Alignment.Center){ Text("Ejemplo 2") }
            Box (Modifier
                .fillMaxWidth()
                .fillMaxSize()
                .weight(1f)
                .background(Color.Green), contentAlignment = Alignment.Center){ Text("Ejemplo 3") }
        }
        Box (Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Magenta), contentAlignment = Alignment.BottomCenter){ Text("Ejemplo 4") }
    }
}


