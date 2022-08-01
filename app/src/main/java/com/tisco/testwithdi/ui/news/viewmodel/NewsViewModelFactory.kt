package com.tisco.testwithdi.ui.news.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.tisco.testwithdi.domain.usecase.*

class NewsViewModelFactory(
    private val app:Application,
    private val getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase,
    private val getMoviesUseCase: GetMoviesUseCase
):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsViewModel(
            app,
            getNewsHeadlinesUseCase,
            getMoviesUseCase
        ) as T
    }
}









