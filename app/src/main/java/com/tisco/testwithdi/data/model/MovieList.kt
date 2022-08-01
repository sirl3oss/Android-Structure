package com.tisco.testwithdi.data.model

import com.google.gson.annotations.SerializedName

data class MovieList(@SerializedName("Search") val mList : List<Movie>)