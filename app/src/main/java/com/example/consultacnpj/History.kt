package com.example.consultacnpj


import com.google.gson.annotations.SerializedName

data class History(
    @SerializedName("from")
    val from: String,
    @SerializedName("text")
    val text: String,
    @SerializedName("to")
    val to: String
)