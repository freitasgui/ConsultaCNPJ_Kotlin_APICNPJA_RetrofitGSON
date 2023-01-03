package com.example.consultacnpj


import com.google.gson.annotations.SerializedName

data class Link(
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)