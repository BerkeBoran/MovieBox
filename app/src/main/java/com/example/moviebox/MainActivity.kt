package com.example.moviebox

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviebox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var movieList: ArrayList<Movie>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val redemption= Movie("The Shawshank Redemption",9.3,1994,R.drawable.redemption,getString(R.string.the_shawshank_redemption_description))
        val theGodFather= Movie("The Godfather",9.2,1972,R.drawable.godfather,getString(R.string.the_godfather_description))
        val theDarkKnight= Movie("The Dark Knight",9.0,2008,R.drawable.darkknight,getString(R.string.the_dark_knight_description))
        val theGodFather2= Movie("The Godfather Part II",9.0,1974,R.drawable.godfather2,getString(R.string.the_godfather_2_description))
        val angryMen= Movie("12 Angry Men",9.0,1974,R.drawable.angrymen,getString(R.string.twelve_angry_man_description))
        val returnOfTheKing= Movie("The Lord of the Rings: The Return of the King",9.0,2003,R.drawable.yuzuklerinefendisi,getString(R.string.return_of_the_kings_description))
        val schindler= Movie("Schindler's List",9.0,1993,R.drawable.schindler,getString(R.string.schindler_description))
        val pulpFiction= Movie("Pulp Fiction",8.9,1994,R.drawable.pulp,getString(R.string.pulp_fiction_description))
        val yuzuk= Movie("The Lord of the Rings: The Fellowship of the Ring",8.9,2001,R.drawable.yuzuklerinefendisiyuzuk,getString(R.string.the_lord_of_the_rings_description))
        val ii= Movie(" Il buono, il brutto, il cattivo",8.8,1966,R.drawable.ii,getString(R.string.il_buono_il_brutto_il_cattivo_description))

        movieList=arrayListOf(redemption,theGodFather,theDarkKnight,theGodFather2,angryMen,returnOfTheKing,schindler,pulpFiction,yuzuk,ii)

        val adapter= MovieAdapter(movieList)
        binding.movieRecyclerView.layoutManager= LinearLayoutManager(this)
        binding.movieRecyclerView.adapter=adapter
    }
}