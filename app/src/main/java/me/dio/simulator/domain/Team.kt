package me.dio.simulator.domain

import com.google.gson.annotations.SerializedName

// estudando a equivalencia que existe entre uma data class e uma classe de objetos tradicional java.
data class Team(
    @SerializedName("nome")
    val name: String,
    @SerializedName("forca")
    val stars: Int,
    @SerializedName("imagem")
    val image: String,
)

