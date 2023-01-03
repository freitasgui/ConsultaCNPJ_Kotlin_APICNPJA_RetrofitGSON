package com.example.consultacnpj


import com.google.gson.annotations.SerializedName

data class Member(
    @SerializedName("agent")
    val agent: Agent,
    @SerializedName("person")
    val person: PersonX,
    @SerializedName("role")
    val role: RoleX,
    @SerializedName("since")
    val since: String
)