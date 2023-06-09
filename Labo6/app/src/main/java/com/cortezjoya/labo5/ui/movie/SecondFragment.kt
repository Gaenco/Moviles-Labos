package com.cortezjoya.labo5.ui.movie

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.cortezjoya.labo5.R
import com.cortezjoya.labo5.data.model.MovieModel
import com.cortezjoya.labo5.data.movies

private lateinit var nameEditText: EditText
private lateinit var categoryEditText: EditText
private lateinit var descriptionEditText: EditText
private lateinit var qualificationEditText: EditText
private lateinit var submitButton: Button

class SecondFragment : Fragment() {

    private val movieViewModel : MovieViewModel by activityViewModels {
        MovieViewModel.Factory
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bind()
        submitButton.setOnClickListener{
            addMovie()
        }
    }

    private fun bind(){
    nameEditText = view?.findViewById(R.id.edit_text_name)!!
    categoryEditText = view?.findViewById(R.id.edit_text_category)!!
    descriptionEditText = view?.findViewById(R.id.edit_text_description)!!
    qualificationEditText = view?.findViewById(R.id.edit_text_calification)!!
        submitButton = view?.findViewById(R.id.btn_submit)!!
}

    private fun addMovie() {
        val name = nameEditText.text.toString()
        val category = categoryEditText.text.toString()
        val description = descriptionEditText.text.toString()
        val qualification = qualificationEditText.text.toString()

        val movie = MovieModel(name, category, description,qualification)


        movieViewModel.addMovies(movie)

        Log.d("NewMovieFragment", movieViewModel.getMovies().toString())

        findNavController().popBackStack()
    }
}
