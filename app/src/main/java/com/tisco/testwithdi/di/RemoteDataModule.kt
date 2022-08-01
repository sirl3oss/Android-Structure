package com.tisco.testwithdi.di

import com.tisco.testwithdi.data.api.MoviesService
import com.tisco.testwithdi.data.api.NewsAPIService
import com.tisco.testwithdi.data.repository.movie.dataSource.MoviesRemoteDataSource
import com.tisco.testwithdi.data.repository.movie.dataSourceImpl.MoviesRemoteDataSourceImpl
import com.tisco.testwithdi.data.repository.news.dataSource.NewsRemoteDataSource
import com.tisco.testwithdi.data.repository.news.dataSourceImpl.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(
        newsAPIService: NewsAPIService
    ): NewsRemoteDataSource {
       return NewsRemoteDataSourceImpl(newsAPIService)
    }

    @Singleton
    @Provides
    fun provideMoviesRemoteDataSource(
        moviesService: MoviesService
    ): MoviesRemoteDataSource {
       return MoviesRemoteDataSourceImpl(moviesService)
    }

}












