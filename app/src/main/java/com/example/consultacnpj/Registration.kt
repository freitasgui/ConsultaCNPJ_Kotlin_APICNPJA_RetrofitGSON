package com.example.consultacnpj


import com.google.gson.annotations.SerializedName

data class Registration(
    @SerializedName("enabled")
    val enabled: Boolean,
    @SerializedName("number")
    val number: String,
    @SerializedName("state")
    val state: String,
    @SerializedName("status")
    val status: StatusX,
    @SerializedName("statusDate")
    val statusDate: String,
    @SerializedName("type")
    val type: Type
)