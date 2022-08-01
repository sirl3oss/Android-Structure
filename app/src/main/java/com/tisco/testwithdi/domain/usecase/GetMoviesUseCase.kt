package com.tisco.testwithdi.domain.usecase

import com.tisco.testwithdi.data.model.MovieList
import com.tisco.testwithdi.utils.Resource
import com.tisco.testwithdi.domain.repository.MoviesRepository

class GetMoviesUseCase(private val moviesRepository: MoviesRepository) {

    suspend fun execute(): Resource<MovieList> {
        return moviesRepository.getAllMovies()
    }
}