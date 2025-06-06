package com.example.moviebox

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.moviebox.databinding.ActivityMovieDescriptionBinding

class MovieDescription : AppCompatActivity() {
    private lateinit var binding: ActivityMovieDescriptionBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMovieDescriptionBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val selectedMovie= intent.getSerializableExtra("selectedMovie") as Movie

        binding.descIvMovieImage.setImageResource(selectedMovie.movieImage)
        binding.descTvMovieName.text="Movie Name: \n${selectedMovie.movieTitle}"
        binding.descTvMovieRating.text="Movie Rating: \n${selectedMovie.movieRating}"
        binding.descTvMovieReleaseYear.text="Movie Release Year: \n${selectedMovie.movieReleaseYear}"
        binding.descTvMovieDescription.text="Movie Description: \n${selectedMovie.movieDescription}"
    }
}