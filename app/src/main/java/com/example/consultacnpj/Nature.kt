package com.example.consultacnpj


import com.google.gson.annotations.SerializedName

data class Nature(
    @SerializedName("id")
    val id: Int,
    @SerializedName("text")
    val text: String
)