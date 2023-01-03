package com.example.consultacnpj


import com.google.gson.annotations.SerializedName

data class Simples(
    @SerializedName("history")
    val history: List<History>,
    @SerializedName("optant")
    val optant: Boolean,
    @SerializedName("since")
    val since: String
)