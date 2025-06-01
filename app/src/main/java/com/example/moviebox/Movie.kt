package com.example.moviebox

import java.io.Serializable

class Movie(val movieTitle: String,val movieRating: Double,val movieReleaseYear: Int,val movieImage: Int,val movieDescription: String) :
    Serializable{
}