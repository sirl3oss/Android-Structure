package com.tisco.testwithdi.di

import com.tisco.testwithdi.BuildConfig
import com.tisco.testwithdi.data.api.MoviesService
import com.tisco.testwithdi.data.api.NewsAPIService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetModule {
    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        // Movies url https://fake-movie-database-api.herokuapp.com/
         return Retrofit.Builder()
             .addConverterFactory(GsonConverterFactory.create())
             .baseUrl(BuildConfig.BASE_URL)
             .build()
    }

    @Singleton
    @Provides
    fun provideNewsAPIService(retrofit: Retrofit): NewsAPIService {
        return retrofit.create(NewsAPIService::class.java)
    }

    @Singleton
    @Provides
    fun provideMoviesAPIService(retrofit: Retrofit): MoviesService {
        return retrofit.create(MoviesService::class.java)
    }
}













