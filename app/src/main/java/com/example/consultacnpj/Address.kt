package com.example.consultacnpj


import com.google.gson.annotations.SerializedName

data class Address(
    @SerializedName("city")
    val city: String,
    @SerializedName("country")
    val country: Country,
    @SerializedName("details")
    val details: String,
    @SerializedName("district")
    val district: String,
    @SerializedName("latitude")
    val latitude: Double,
    @SerializedName("longitude")
    val longitude: Double,
    @SerializedName("municipality")
    val municipality: Int,
    @SerializedName("number")
    val number: String,
    @SerializedName("state")
    val state: String,
    @SerializedName("street")
    val street: String,
    @SerializedName("zip")
    val zip: String
)