package com.example.consultacnpj


import com.google.gson.annotations.SerializedName

data class Company(
    @SerializedName("equity")
    val equity: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("jurisdiction")
    val jurisdiction: String,
    @SerializedName("members")
    val members: List<Member>,
    @SerializedName("name")
    val name: String,
    @SerializedName("nature")
    val nature: Nature,
    @SerializedName("simei")
    val simei: Simei,
    @SerializedName("simples")
    val simples: Simples,
    @SerializedName("size")
    val size: Size
)