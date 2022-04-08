package com.lharo.exam

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter (context: Context, feedEntries: ArrayList<MovieModel>):
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private var localContext: Context? = null
    private var localFeedEntries: ArrayList<MovieModel>?=null

    init{
        localContext=context
        localFeedEntries=feedEntries
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        val currentFeedEntry: MovieModel= localFeedEntries!![position]
        holder.textNombrePelicula.text=currentFeedEntry.title
        holder.textYear.text=currentFeedEntry.year
        holder.textDirector.text=currentFeedEntry.director
        holder.textLenguajes.text=currentFeedEntry.language
    }

    override fun getItemCount(): Int {
        return localFeedEntries?.size ?: 0
    }

    class ViewHolder(v: View): RecyclerView.ViewHolder(v){
        val textNombrePelicula: TextView =v.findViewById(R.id.textNombrePelicula)
        val textYear: TextView =v.findViewById(R.id.textYear)
        val textDirector: TextView =v.findViewById(R.id.textDirector)
        val textLenguajes: TextView =v.findViewById(R.id.textLenguajes)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(localContext)
        val view: View =layoutInflater.inflate(R.layout.activity_movies, parent, false)
        return ViewHolder(view)
    }
}
