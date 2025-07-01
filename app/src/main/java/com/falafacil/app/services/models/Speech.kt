package com.falafacil.app.services.models

import com.falafacil.app.R

data class SpeechItem(val text: String, val iconRes: Int)

val speechItems = listOf(
    SpeechItem("Eu", R.drawable.ic_eu),
    SpeechItem("Quero", R.drawable.ic_quero),
    SpeechItem("Amigos", R.drawable.ic_amigos),
    SpeechItem("Brincar", R.drawable.ic_brincar),
    SpeechItem("Quintal", R.drawable.ic_quintal),
    SpeechItem("Frutas", R.drawable.ic_frutas),
    SpeechItem("Agua", R.drawable.ic_agua),
    SpeechItem("Comida", R.drawable.ic_comida),
    SpeechItem("Passear", R.drawable.ic_passear),
    SpeechItem("Jogar", R.drawable.ic_jogar),
    SpeechItem("Banheiro", R.drawable.ic_banheiro),
    SpeechItem("Triste", R.drawable.ic_triste)
)
