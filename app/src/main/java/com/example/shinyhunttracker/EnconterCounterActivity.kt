package com.example.shinyhunttracker


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.shinyhunttracker.ui.theme.ShinyHuntTrackerTheme

class EncounterCounterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val pokemonName = intent.getStringExtra("pokemonName")
        val pokemonGameName = intent.getStringExtra("pokemonGameName")
        val numOfEncounters = intent.getStringExtra("numOfEncounters") ?: 0

        setContent {
            ShinyHuntTrackerTheme {
                EncounterCounterScreen()
            }
        }
    }
}