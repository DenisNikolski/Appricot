package com.example.appricot

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.appricot.data.models.Film
import com.example.appricot.domain.FilmsDataSource

class FragmentMoviesDetails : Fragment(R.layout.fragment_movies_details) {
    private var actorsRecyclerView: RecyclerView? = null
    private lateinit var film: Film

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val filmId = arguments?.getInt("filmId")
        film = FilmsDataSource().getFilms().find { film -> film.id == filmId }!!

        bindFilmInfo(view)
        actorsRecyclerView = view.findViewById(R.id.actors_list)
        actorsRecyclerView?.adapter = ActorsAdapter(film.actors)
    }

    private fun bindFilmInfo(view: View) {
        val ageRateTextView: TextView = view.findViewById(R.id.text_age_rate)
        val nameTextView: TextView = view.findViewById(R.id.text_film_title)
        val genresTextView: TextView = view.findViewById(R.id.text_tag_line)
        val ratingBar: RatingBar = view.findViewById(R.id.rating_bar)
        val reviewScoreTextView: TextView = view.findViewById(R.id.text_review_score)
        val descriptionTextView: TextView = view.findViewById(R.id.text_story_line_desctiption)
        val filmImageView: ImageView = view.findViewById(R.id.image_film)

        Glide.with(view.context)
            .load(film.img_source)
            .apply(imageOption)
            .into(filmImageView)
        ageRateTextView.text = film.ageRate
        nameTextView.text = film.name
        genresTextView.text = film.genres.joinToString(", ")
        ratingBar.rating = film.rating
        reviewScoreTextView.text = view.context.getString(R.string.reviews, film.reviewsAmount)
        descriptionTextView.text = film.description
    }

    companion object {
        fun newInstance(filmId: Int): FragmentMoviesDetails {
            return FragmentMoviesDetails().apply {
                arguments = Bundle().apply {
                    putInt("filmId", filmId)
                }
            }
        }
    }

    private val imageOption = RequestOptions()
        .placeholder(R.drawable.ic_avatar_placeholder)
        .fallback(R.drawable.ic_avatar_placeholder)
}
