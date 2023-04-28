package com.cortezjoya.labo5.repositories

import com.cortezjoya.labo5.data.model.MovieModel
import com.cortezjoya.labo5.data.movies

class MovieRepository (private val movies: MutableList<MovieModel>) {

        fun getMovies() = movies

        fun addMovies(movie: MovieModel) = movies.add(movie)
}