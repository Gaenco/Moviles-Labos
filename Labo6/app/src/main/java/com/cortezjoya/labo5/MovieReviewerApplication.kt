package com.cortezjoya.labo5

import android.app.Application
import com.cortezjoya.labo5.data.movies
import com.cortezjoya.labo5.repositories.MovieRepository

class MovieReviewerApplication: Application() {
    val movieRepository : MovieRepository by lazy {
        MovieRepository(movies)
    }
}