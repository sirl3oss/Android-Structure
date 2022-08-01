package com.tisco.testwithdi.ui.base

import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BaseActivity : AppCompatActivity() {

    override fun onBackPressed() {
        super.onBackPressed()

        //Handle some
    }
}