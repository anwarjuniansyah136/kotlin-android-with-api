package com.example.api.api

import com.example.api.api.service.ProductService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    private const val BASE_URL = "https://dummyjson.com/"

    private val retrofit:Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val productService : ProductService by lazy {
        retrofit.create(ProductService::class.java)
    }
}