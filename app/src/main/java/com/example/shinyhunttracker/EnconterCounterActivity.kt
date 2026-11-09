package com.example.shinyhunttracker


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.shinyhunttracker.ui.theme.ShinyHuntTrackerTheme

class EncounterCounterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val pokemonName = intent.getStringExtra("pokemonName") ?: "Pokemon Name"
        val pokemonGameName = intent.getStringExtra("pokemonGameName") ?: "Pokemon Game Name"
        val numOfEncounters = intent.getIntExtra("numOfEncounters", 0)

        setContent {
            ShinyHuntTrackerTheme {
                EncounterCounterScreen(
                    pokemonName = pokemonName,
                    pokemonGameName = pokemonGameName,
                    numOfEncounters = numOfEncounters


                )
            }
        }
    }
}