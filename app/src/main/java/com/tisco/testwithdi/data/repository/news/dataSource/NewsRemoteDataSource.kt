package com.tisco.testwithdi.data.repository.news.dataSource

import com.tisco.testwithdi.data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadlines(country : String, page : Int):Response<APIResponse>
    suspend fun getSearchedNews(country : String,searchQuery:String, page : Int):Response<APIResponse>
}