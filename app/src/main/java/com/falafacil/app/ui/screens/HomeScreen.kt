package com.falafacil.app.ui.screens

import android.speech.tts.TextToSpeech
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import com.falafacil.app.services.models.SpeechItem
import java.util.*

@Composable
fun HomeScreen() {
    val context = LocalContext.current
    val selectedItems = remember { mutableStateListOf<SpeechItem>() }
    val tts = remember { TextToSpeech(context) { it } }

    // Inicializa TTS com idioma
    DisposableEffect(Unit) {
        tts.language = Locale("pt", "BR")
        onDispose { tts.shutdown() }
    }

    fun onSpeakClick() {
        val phrase = selectedItems.joinToString(" ") { it.text }
        if (phrase.isNotBlank()) {
            tts.speak(phrase, TextToSpeech.QUEUE_FLUSH, null, null)
        }
    }

    CommunicationBoard(
        selectedItems = selectedItems,
        onItemToggle = { item ->
            if (selectedItems.contains(item)) {
                selectedItems.remove(item)
            } else {
                selectedItems.add(item)
            }
        },
        onSpeakClick = ::onSpeakClick
    )
}