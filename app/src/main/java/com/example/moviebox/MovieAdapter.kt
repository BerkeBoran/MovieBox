package com.example.moviebox

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviebox.databinding.ActivityRecyclerRowBinding

class MovieAdapter(val movieList : ArrayList<Movie>): RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    class MovieViewHolder(val binding : ActivityRecyclerRowBinding): RecyclerView.ViewHolder(binding.root){

    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): MovieViewHolder {
        val binding = ActivityRecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MovieViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: MovieViewHolder,
        position: Int,
    ) {
        val currentMovie = movieList[position]
        holder.binding.rowTvMovieName.text=currentMovie.movieTitle
        holder.binding.rowTvMovieRating.text="Rating: ${currentMovie.movieRating}"
        holder.binding.rowIvMovieImage.setImageResource(currentMovie.movieImage)


        holder.itemView.setOnClickListener {
            val intent= Intent(holder.itemView.context, MovieDescription::class.java)
            intent.putExtra("selectedMovie",movieList[position])
            holder.itemView.context.startActivity(intent)
        }


    }

    override fun getItemCount(): Int {
        return movieList.size

    }


}