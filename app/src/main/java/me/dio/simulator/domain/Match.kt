package me.dio.simulator.domain

import com.google.gson.annotations.SerializedName
import java.io.FileDescriptor

//
data class Match(
    @SerializedName("descricao")
    val description: String,
    @SerializedName("local")
    val place: Place,
    @SerializedName("nmandante")
    val homeTeam: Team,
    @SerializedName("visitante")
    val awayTeam: Team
)