package com.example.mynewcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mynewcompose.ui.theme.MyNewComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyNewComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    MySuperText(
//                        modifier = Modifier.padding(innerPadding), name = "Hola Kev"
//                    )
//                    MyBox(modifier = Modifier.padding(innerPadding))
//                    MyComplexLayout(modifier = Modifier.padding(innerPadding))
// EJERCICIO
                    //ComplexLayoutExercise(modifier = Modifier.padding(innerPadding))
                    MyStateExample(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyComplexLayout()
}

@Composable
fun MyComplexLayout(modifier: Modifier = Modifier.fillMaxSize()) {
    Column(Modifier.fillMaxSize()) {
        Box(
            modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan)) {

        }
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)) {
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green))
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red), contentAlignment = Alignment.Center){
                Text("Hola Soy Kevyn")
            }
        }
        Box(
            modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Blue)) {

        }
    }
}


//El row es lo mismo que la columna solo que se utiliza
//el horizontal arrangement
// y el horizontalScroll con su rememberScrollState
@Composable
fun MyColumn() {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceEvenly) {
        Text("Ejemplo 1", modifier = Modifier
            .background(Color.Red)
            .weight(1f))
        Text("Ejemplo 2", modifier = Modifier
            .background(Color.Blue)
            .weight(2f))
        Text("Ejemplo 3", modifier = Modifier.background(Color.Yellow))
    }
}

@Composable
fun MyBox(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .width(200.dp)
                .height(50.dp)
                .background(Color.Cyan), contentAlignment = Alignment.TopCenter
        ) {
            Text("Holiwis")
        }
    }
}

//@Preview(showSystemUi = true, device = Devices.NEXUS_5)
//@Composable
//fun MyTestSuperText() {
//    MySuperText(name = "nani")
//}
//
//
//@Composable
//fun MySuperText(modifier: Modifier = Modifier, name: String) {
//    Text(text = "SOY KEVYN $name", modifier = modifier)
//}
//
