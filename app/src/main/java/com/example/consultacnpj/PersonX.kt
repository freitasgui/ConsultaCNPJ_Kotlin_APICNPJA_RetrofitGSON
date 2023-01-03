package com.example.consultacnpj


import com.google.gson.annotations.SerializedName

data class PersonX(
    @SerializedName("age")
    val age: String,
    @SerializedName("country")
    val country: Country,
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("taxId")
    val taxId: String,
    @SerializedName("type")
    val type: String
)