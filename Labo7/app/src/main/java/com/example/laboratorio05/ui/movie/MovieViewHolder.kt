package com.example.laboratorio05.ui.movie

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio05.R
import com.example.laboratorio05.data.model.MovieModel

class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private var nameTextView =
        itemView.findViewById<TextView>(R.id.movie_title)

    private var calificationTextView =
        itemView.findViewById<TextView>(R.id.movie_calification)

    private var imageMovieImageView =
        itemView.findViewById<ImageView>(R.id.imageView)

    fun bind(movie: MovieModel, onClickListener: (MovieModel) -> Unit) {
        nameTextView.text = movie.name
        calificationTextView.text = movie.qualification

        nameTextView.setOnClickListener {
            onClickListener(movie)
        }

        calificationTextView.setOnClickListener {
            onClickListener(movie)
        }
    }

}

