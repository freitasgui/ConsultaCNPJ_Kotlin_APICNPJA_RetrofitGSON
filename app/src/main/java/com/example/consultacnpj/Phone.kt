package com.example.consultacnpj


import com.google.gson.annotations.SerializedName

data class Phone(
    @SerializedName("area")
    val area: String,
    @SerializedName("number")
    val number: String
)