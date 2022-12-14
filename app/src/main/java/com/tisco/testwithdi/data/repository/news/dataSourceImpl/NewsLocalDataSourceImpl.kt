package com.tisco.testwithdi.data.repository.news.dataSourceImpl

import com.tisco.testwithdi.data.db.ArticleDAO
import com.tisco.testwithdi.data.model.Article
import com.tisco.testwithdi.data.repository.news.dataSource.NewsLocalDataSource
import kotlinx.coroutines.flow.Flow

class NewsLocalDataSourceImpl(
    private val articleDAO: ArticleDAO
) : NewsLocalDataSource {
    override suspend fun saveArticleToDB(article: Article) {
        articleDAO.insert(article)
    }

    override fun getSavedArticles(): Flow<List<Article>> {
        return articleDAO.getAllArticles()
    }

    override suspend fun deleteArticlesFromDB(article: Article) {
        articleDAO.deleteArticle(article)
    }
}