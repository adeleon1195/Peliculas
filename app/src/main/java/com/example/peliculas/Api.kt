package com.example.peliculas

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "1fa29a6f72e1db0fb3b2ff7eb5581fbe",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

}