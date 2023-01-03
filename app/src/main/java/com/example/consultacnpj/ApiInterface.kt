package com.example.consultacnpj

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Path


interface ApiInterface {
    @GET("/office/{taxId}")
    suspend fun getAddress(@Path("taxId") cep : String, @Header("Authorization") auth : String): Response<cnpj>
}