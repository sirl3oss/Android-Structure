package com.tisco.testwithdi.ui.news.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.tisco.testwithdi.data.model.APIResponse
import com.tisco.testwithdi.utils.Resource
import com.tisco.testwithdi.utils.isNetworkAvailable
import com.tisco.testwithdi.domain.usecase.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception

@HiltViewModel
class NewsViewModel(
    private val app: Application,
    private val getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase,
    private val getMoviesUseCase: GetMoviesUseCase
) : ViewModel() {
    val newsHeadLines: MutableLiveData<Resource<APIResponse>> = MutableLiveData()

    fun getNewsHeadLines(country: String, page: Int) = viewModelScope.launch(Dispatchers.IO) {
        newsHeadLines.postValue(Resource.Loading())
        try {
            if (isNetworkAvailable(app)) {
                val apiResult = getNewsHeadlinesUseCase.execute(country, page)
                newsHeadLines.postValue(apiResult)
            } else {
                newsHeadLines.postValue(Resource.Error("Internet is not available"))
            }
        } catch (e: Exception) {
            newsHeadLines.postValue(Resource.Error(e.message.toString()))
        }
    }

    fun test() = viewModelScope.launch {
        Dispatchers.IO
        val x = getMoviesUseCase.execute()
        val bx = x.data
    }
}














