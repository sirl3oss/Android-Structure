package com.tisco.testwithdi.data.repository.movie

import com.tisco.testwithdi.data.model.MovieList
import com.tisco.testwithdi.data.repository.movie.dataSource.MoviesRemoteDataSource
import com.tisco.testwithdi.utils.Resource
import com.tisco.testwithdi.domain.repository.MoviesRepository
import retrofit2.Response

class MoviesRepositoryImpl(
    private val moviesRemoteDataSource: MoviesRemoteDataSource
) : MoviesRepository {
    override suspend fun getAllMovies(): Resource<MovieList> {
        return responseToResource(moviesRemoteDataSource.getAllMovies())
    }

    private fun responseToResource(response: Response<MovieList>): Resource<MovieList> {
        if (response.isSuccessful) {
            response.body()?.let { result ->
                return Resource.Success(result)
            }
        }
        return Resource.Error(response.message())
    }
}