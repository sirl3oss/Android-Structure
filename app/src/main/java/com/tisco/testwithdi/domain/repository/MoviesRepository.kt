package com.tisco.testwithdi.domain.repository

import com.tisco.testwithdi.data.model.MovieList
import com.tisco.testwithdi.utils.Resource

interface MoviesRepository{
    suspend fun getAllMovies(): Resource<MovieList>
}