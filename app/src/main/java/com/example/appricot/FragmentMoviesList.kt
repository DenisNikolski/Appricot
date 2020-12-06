package com.example.appricot

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.appricot.data.models.Film

class FragmentMoviesList : Fragment(R.layout.fragment_movies_list) {
    private var filmsRecyclerView: RecyclerView? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        filmsRecyclerView = view.findViewById<RecyclerView>(R.id.movies_list).apply {
            adapter = FilmsAdapter(filmClickListener)
            addItemDecoration(FilmItemMarginDecorator(16))
        }
    }

    override fun onStart() {
        super.onStart()
        (filmsRecyclerView?.adapter as? FilmsAdapter)?.bindFilms()
    }

    override fun onDetach() {
        super.onDetach()
        filmsRecyclerView = null
    }

    private val filmClickListener = object : OnRecyclerItemClicked {
        override fun onClick(film: Film) {
            parentFragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .add(R.id.frame_layout, FragmentMoviesDetails.newInstance(film.id))
                .commit()
        }
    }

    companion object {
        fun newInstance(): FragmentMoviesList = FragmentMoviesList()
    }
}
