package com.example.shinyhunttracker


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.shinyhunttracker.ui.theme.ShinyHuntTrackerTheme

class EncounterCounterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ShinyHuntTrackerTheme {
                EncounterCounterScreen()
            }
        }
    }
}