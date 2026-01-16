package com.example.calculatricebasique // Déclare le package de l'application.

import android.os.Bundle // Importe la classe Bundle pour gérer les données de l'activité.
import androidx.activity.ComponentActivity // Importe la classe de base pour les activités utilisant Jetpack Compose.
import androidx.activity.compose.setContent // Importe la fonction pour définir le contenu de l'activité avec Compose.
import androidx.activity.enableEdgeToEdge // Importe la fonction pour activer le mode plein écran.
import androidx.compose.foundation.layout.fillMaxSize // Importe le modificateur pour remplir la taille maximale de l'écran.
import androidx.compose.foundation.layout.padding // Importe le modificateur pour ajouter des marges internes.
import androidx.compose.material3.Scaffold // Importe la classe Scaffold pour structurer l'interface utilisateur.
import androidx.compose.material3.Text // Importe le composant Text pour afficher du texte.
import androidx.compose.runtime.Composable // Importe l'annotation Composable pour définir des fonctions composables.
import androidx.compose.ui.Modifier // Importe la classe Modifier pour modifier les éléments de l'interface utilisateur.
import androidx.compose.ui.tooling.preview.Preview // Importe l'annotation Preview pour prévisualiser les composables.
import com.example.calculatricebasique.ui.theme.CalculatriceBasiqueTheme // Importe le thème de l'application.
import android.content.res.Configuration // Importe la classe Configuration pour gérer les configurations de l'appareil.
import com.example.calculatricebasique.presentation.Cal_interface
//import com.example.calculator.presentation.CalculatorScreen
import com.example.calculatricebasique.presentation.Cal_interface

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalculatriceBasiqueTheme {
                Cal_interface()
            }
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun DefaultPreview() {
    CalculatriceBasiqueTheme {
        Cal_interface()
    }
}
