package com.tisco.testwithdi.domain.repository

import com.tisco.testwithdi.data.model.APIResponse
import com.tisco.testwithdi.data.model.Article
import com.tisco.testwithdi.utils.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository{
      suspend fun getNewsHeadlines(country : String, page : Int): Resource<APIResponse>
      suspend fun getSearchedNews(country: String,searchQuery:String,page: Int) : Resource<APIResponse>
      suspend fun saveNews(article: Article)
      suspend fun deleteNews(article: Article)
      fun getSavedNews(): Flow<List<Article>>
}