package com.tisco.testwithdi.domain.usecase

import com.tisco.testwithdi.data.model.Article
import com.tisco.testwithdi.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article)=newsRepository.deleteNews(article)
}