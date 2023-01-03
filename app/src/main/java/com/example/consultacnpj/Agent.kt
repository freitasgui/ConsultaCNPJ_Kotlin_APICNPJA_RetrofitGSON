package com.example.consultacnpj


import com.google.gson.annotations.SerializedName

data class Agent(
    @SerializedName("person")
    val person: PersonX,
    @SerializedName("role")
    val role: RoleX
)