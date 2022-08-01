package com.tisco.testwithdi.domain.usecase

import com.tisco.testwithdi.data.model.Article
import com.tisco.testwithdi.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
    fun execute(): Flow<List<Article>>{
        return newsRepository.getSavedNews()
    }
}