package com.example.api.api.service

import com.example.api.api.model.ProductResponse
import retrofit2.Call
import retrofit2.http.GET

interface ProductService {
    @GET("products")
    fun getAll() : Call<ProductResponse>
}