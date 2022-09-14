package com.softim.upaxtecnica.domain.data.models

import com.google.gson.annotations.SerializedName

data class MoviesResponse(
    @SerializedName("results")
    val movies : List<Movie> ?= emptyList()

)
