package com.tisco.testwithdi.ui.news.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import com.tisco.testwithdi.R
import com.tisco.testwithdi.databinding.ActivityNewsBinding
import com.tisco.testwithdi.ui.news.adapter.NewsAdapter
import com.tisco.testwithdi.ui.news.viewmodel.NewsViewModel
import com.tisco.testwithdi.ui.news.viewmodel.NewsViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class NewsActivity : AppCompatActivity() {
    @Inject
    lateinit var factory: NewsViewModelFactory

    @Inject
    lateinit var newsAdapter: NewsAdapter

    lateinit var viewModel: NewsViewModel
    private lateinit var binding: ActivityNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragment) as NavHostFragment
        val navController = navHostFragment.navController

        viewModel = ViewModelProvider(this, factory)[NewsViewModel::class.java]
    }
}