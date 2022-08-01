package com.tisco.testwithdi.data.repository.movie.dataSourceImpl

import com.tisco.testwithdi.data.api.MoviesService
import com.tisco.testwithdi.data.model.MovieList
import com.tisco.testwithdi.data.repository.movie.dataSource.MoviesRemoteDataSource
import retrofit2.Response

class MoviesRemoteDataSourceImpl(
        private val movieAPIService: MoviesService
): MoviesRemoteDataSource {
    override suspend fun getAllMovies(): Response<MovieList> {
        return movieAPIService.getAllMovies()
    }
}