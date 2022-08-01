package com.tisco.testwithdi.data.repository.movie.dataSource

import com.tisco.testwithdi.data.model.APIResponse
import com.tisco.testwithdi.data.model.MovieList
import retrofit2.Response

interface MoviesRemoteDataSource {
    suspend fun getAllMovies():Response<MovieList>
}