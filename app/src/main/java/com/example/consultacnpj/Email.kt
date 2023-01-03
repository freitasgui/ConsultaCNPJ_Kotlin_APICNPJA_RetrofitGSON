package com.example.consultacnpj


import com.google.gson.annotations.SerializedName

data class Email(
    @SerializedName("address")
    val address: String,
    @SerializedName("domain")
    val domain: String
)