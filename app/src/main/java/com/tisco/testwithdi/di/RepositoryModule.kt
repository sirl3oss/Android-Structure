package com.tisco.testwithdi.di

import com.tisco.testwithdi.data.repository.movie.MoviesRepositoryImpl
import com.tisco.testwithdi.data.repository.movie.dataSource.MoviesRemoteDataSource
import com.tisco.testwithdi.data.repository.news.NewsRepositoryImpl
import com.tisco.testwithdi.data.repository.news.dataSource.NewsLocalDataSource
import com.tisco.testwithdi.data.repository.news.dataSource.NewsRemoteDataSource
import com.tisco.testwithdi.domain.repository.MoviesRepository
import com.tisco.testwithdi.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource,
        newsLocalDataSource: NewsLocalDataSource
    ): NewsRepository {
        return NewsRepositoryImpl(
            newsRemoteDataSource,
            newsLocalDataSource
        )
    }

    @Singleton
    @Provides
    fun provideMoviesRepository(
        moviesRemoteDataSource: MoviesRemoteDataSource,
    ): MoviesRepository {
        return MoviesRepositoryImpl(
            moviesRemoteDataSource
        )
    }

}














