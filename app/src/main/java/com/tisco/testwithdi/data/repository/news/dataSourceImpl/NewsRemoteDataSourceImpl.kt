package com.tisco.testwithdi.data.repository.news.dataSourceImpl

import com.tisco.testwithdi.data.api.NewsAPIService
import com.tisco.testwithdi.data.model.APIResponse
import com.tisco.testwithdi.data.repository.news.dataSource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
        private val newsAPIService: NewsAPIService
): NewsRemoteDataSource {
    override suspend fun getTopHeadlines(country : String, page : Int): Response<APIResponse> {
          return newsAPIService.getTopHeadlines(country,page)
    }

    override suspend fun getSearchedNews(
        country: String,
        searchQuery: String,
        page: Int
    ): Response<APIResponse> {
        return newsAPIService.getSearchedTopHeadlines(country,searchQuery,page)
    }
}