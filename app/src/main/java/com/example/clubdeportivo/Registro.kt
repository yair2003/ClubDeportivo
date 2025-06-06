package com.example.clubdeportivo

import androidx.activity.ComponentActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

class Registro : ComponentActivity(){
}
@Composable
fun RegisterScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1C5C65))
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("REGISTRO", style = MaterialTheme.typography.headlineSmall, color = Color.White)

        val campos = listOf("NOMBRES", "APELLIDOS", "FECHA NACIMIENTO", "DNI", "CELULAR", "E-MAIL", "CONTRASEÑA")

        campos.forEach { label ->
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text(label) },
                modifier = Modifier.fillMaxWidth()
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { navController.navigate("menu") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("GO !")
        }
    }
}