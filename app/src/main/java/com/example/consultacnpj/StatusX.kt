package com.example.consultacnpj


import com.google.gson.annotations.SerializedName

data class StatusX(
    @SerializedName("id")
    val id: Int,
    @SerializedName("text")
    val text: String
)