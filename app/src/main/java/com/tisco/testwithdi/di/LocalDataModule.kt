package com.tisco.testwithdi.di

import com.tisco.testwithdi.data.db.ArticleDAO
import com.tisco.testwithdi.data.repository.news.dataSource.NewsLocalDataSource
import com.tisco.testwithdi.data.repository.news.dataSourceImpl.NewsLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {
    @Singleton
    @Provides
    fun provideLocalDataSource(articleDAO: ArticleDAO): NewsLocalDataSource {
        return NewsLocalDataSourceImpl(articleDAO)
    }

}













