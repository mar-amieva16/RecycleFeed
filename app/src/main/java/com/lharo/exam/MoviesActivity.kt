package com.lharo.exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager

class MoviesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyclerview)

        val movies = ArrayList<MovieModel>()
        val titles: Array<String> = resources.getStringArray(R.array.title)
        val years: Array<String> = resources.getStringArray(R.array.year)
        val directors: Array<String> = resources.getStringArray(R.array.director)
        val genres: Array<String> = resources.getStringArray(R.array.genre)
        val languages: Array<String> = resources.getStringArray(R.array.language)
        val metascores: Array<String> = resources.getStringArray(R.array.metascore)
        val imdbRatings: Array<String> = resources.getStringArray(R.array.imdbRating)
        val imdbVotes: Array<String> = resources.getStringArray(R.array.imdbVotes)

        for((i, element) in titles.withIndex()){
            val movie = MovieModel()
            movie.title = element
            movie.year = years[i]
            movie.director = directors[i]
            movie.genre = genres[i]
            movie.language = languages[i]
            movie.metascore = metascores[i]
            movie.imdbRating = imdbRatings[i]
            movie.imdbVotes = imdbVotes[i]
            movies.add(movie)
        }

        val adapter = RecyclerAdapter(this, movies)
        val localRecyclerView=findViewById<RecyclerView>(R.id.localRecyclerView)
        localRecyclerView.adapter=adapter
        localRecyclerView.layoutManager= LinearLayoutManager(this)
    }
}