package com.muklas.retrofit

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiInterface {
    @GET("volley_array.json")
    fun getMovies(): Call<List<Movie>>

    companion object {
        var BASE_URL = "https://muklas.com/api/movie"
        fun create(): ApiInterface {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(ApiInterface::class.java)
        }
    }
}