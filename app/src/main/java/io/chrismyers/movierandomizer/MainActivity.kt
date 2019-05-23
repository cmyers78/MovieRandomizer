package io.chrismyers.movierandomizer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.net.HttpURLConnection
import java.net.URL
import java.util.*

class MainActivity : AppCompatActivity() {

    val movieList = arrayListOf<String>("Captain Marvel", "Rio", "Rio 2", "The Last Jedi", "Charlie Brown", "Mary Poppins", "School of Rock")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        randomizeButton.setOnClickListener {
            val random = Random()
            val randomMovie = random.nextInt(movieList.count())
            selectedMovie.text = movieList[randomMovie]
        }

        addMovieButton.setOnClickListener {
            val movie = addMovieTextField.text.toString()
            movieList.add(movie)
            addMovieTextField.text.clear()
            println(movieList)

        }

    }

    fun throwAway(): String {
        return "Thrownaway"
    }
}
