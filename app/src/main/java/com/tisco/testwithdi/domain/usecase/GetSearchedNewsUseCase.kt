package com.tisco.testwithdi.domain.usecase

import com.tisco.testwithdi.data.model.APIResponse
import com.tisco.testwithdi.utils.Resource
import com.tisco.testwithdi.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(country: String, searchQuery: String, page: Int): Resource<APIResponse> {
        return newsRepository.getSearchedNews(country, searchQuery, page)
    }
}