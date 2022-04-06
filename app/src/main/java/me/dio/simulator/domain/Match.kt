package me.dio.simulator.domain

import java.io.FileDescriptor

//
data class Match(
    val description: String,
    val place: Place,
    val homeTeam: Team,
    val awayTeam: Team
)