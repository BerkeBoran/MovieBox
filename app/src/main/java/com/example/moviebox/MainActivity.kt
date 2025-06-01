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
        val redemption= Movie("The Shawshank Redemption",9.3,1994,R.drawable.redemption,"A banker convicted of uxoricide forms a friendship over a quarter century with a hardened convict, while maintaining his innocence and trying to remain hopeful through simple compassion.\n" +
            "\n")
        val theGodFather= Movie("The Godfather",9.2,1972,R.drawable.godfather,"The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.\n" +
            "\n")
        val theDarkKnight= Movie("The Dark Knight",9.0,2008,R.drawable.darkknight,"When a menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman, James Gordon and Harvey Dent must work together to put an end to the madness.\n" +
            "\n")
        val theGodFather2= Movie("The Godfather Part II",9.0,1974,R.drawable.godfather2,"The early life and career of Vito Corleone in 1920s New York City is portrayed, while his son, Michael, expands and tightens his grip on the family crime syndicate.\n" +
            "\n")
        val angryMen= Movie("12 Angry Men",9.0,1974,R.drawable.godfather2,"The early life and career of Vito Corleone in 1920s New York City is portrayed, while his son, Michael, expands and tightens his grip on the family crime syndicate.\n" +
            "\n")
        val returnOfTheKing= Movie("The Lord of the Rings: The Return of the King",9.0,2003,R.drawable.yuzuklerinefendisi,"Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring.\n" +
            "\n")
        val schindler= Movie("Schindler's List",9.0,1993,R.drawable.schindler,"In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazis.\n" +
            "\n")
        val pulpFiction= Movie("Pulp Fiction",8.9,1994,R.drawable.pulp,"The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.\n" +
            "\n")
        val yuzuk= Movie("The Lord of the Rings: The Fellowship of the Ring",8.9,2001,R.drawable.yuzuklerinefendisiyuzuk,"A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.\n" +
            "\n")
        val ii= Movie(" Il buono, il brutto, il cattivo",8.8,1966,R.drawable.ii,"A bounty-hunting scam joins two men in an uneasy alliance against a third in a race to find a fortune in gold buried in a remote cemetery.\n" +
            "\n")

        movieList=arrayListOf(redemption,theGodFather,theDarkKnight,theGodFather2,angryMen,returnOfTheKing,schindler,pulpFiction,yuzuk,ii)

        val adapter= MovieAdapter(movieList)
        binding.movieRecyclerView.layoutManager= LinearLayoutManager(this)
        binding.movieRecyclerView.adapter=adapter
    }
}