package com.tisco.testwithdi.data.api

import com.tisco.testwithdi.BuildConfig
import com.tisco.testwithdi.data.model.APIResponse
import com.tisco.testwithdi.data.model.MovieList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesService {
    @GET("api?s=batman")
    suspend fun getAllMovies(): Response<String>
}