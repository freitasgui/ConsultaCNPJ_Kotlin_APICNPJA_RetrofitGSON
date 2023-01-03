package com.example.consultacnpj


import com.google.gson.annotations.SerializedName

data class Size(
    @SerializedName("acronym")
    val acronym: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("text")
    val text: String
)