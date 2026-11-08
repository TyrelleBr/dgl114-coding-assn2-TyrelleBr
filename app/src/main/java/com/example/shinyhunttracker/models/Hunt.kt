package com.example.shinyhunttracker.models

data class Hunt (
    val pokemonName: String,
    val pokemonGameName: String,
    var numOfEncounters: Int = 0
)