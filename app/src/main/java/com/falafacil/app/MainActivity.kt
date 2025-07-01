package com.falafacil.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.falafacil.app.navigation.AppNavigation
import com.falafacil.app.ui.theme.Fala_facilTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Fala_facilTheme {
                AppNavigation()
            }
        }
    }
}