package com.example.helloworldcompose.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.helloworldcompose.HelloWorld

@Composable
fun MyApp() {
    var mensaje by remember { mutableStateOf("Bienvenido a Compose") }

    Scaffold(modifier = Modifier.fillMaxSize()) { defaultPadding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(defaultPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Diana Sosa",
            modifier = Modifier.padding(bottom = 24.dp)

            )

            Text(text = mensaje)
            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick= {
                    mensaje = "Gracias por usar Compose"
                }
            ) {
                Text("Presionar boton")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Icon(
                imageVector = Icons.Default.ThumbUp,
                contentDescription = "Icono de Like",
                modifier = Modifier.size(60.dp)

            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewMyApp() {
    MyApp()
}