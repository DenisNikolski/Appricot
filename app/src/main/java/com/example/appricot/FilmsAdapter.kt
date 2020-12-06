package com.example.appricot

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appricot.data.models.Film
import com.example.appricot.domain.FilmsDataSource

class FilmsAdapter(private val clickListener: OnRecyclerItemClicked) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var films = listOf<Film>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return FilmsViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.view_holder_movie, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as FilmsViewHolder).apply {
            onBind(films[position])
            itemView.setOnClickListener { clickListener.onClick(films[position]) }
        }
    }

    override fun getItemCount(): Int = films.size

    fun bindFilms() {
        films = FilmsDataSource().getFilms()
        notifyDataSetChanged()
    }
}

interface OnRecyclerItemClicked {
    fun onClick(film: Film)
}
