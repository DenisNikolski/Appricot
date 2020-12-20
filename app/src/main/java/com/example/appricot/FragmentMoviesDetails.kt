package com.example.appricot

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.appricot.data.models.Film

class FragmentMoviesDetails : Fragment(R.layout.fragment_movies_details) {
    private var actorsRecyclerView: RecyclerView? = null
    private lateinit var film: Film

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        film = arguments?.getParcelable<Film>("film")!!
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
            .load(film.poster)
            .apply(imageOption)
            .into(filmImageView)
        ageRateTextView.text = "${film.ageRate}+"
        nameTextView.text = film.name
        genresTextView.text = film.genres.joinToString(", ") { genre -> genre.name }
        ratingBar.rating = film.rating / 2
        reviewScoreTextView.text = view.context.getString(R.string.reviews, film.reviewsAmount)
        descriptionTextView.text = film.description
    }

    companion object {
        fun newInstance(film: Film): FragmentMoviesDetails {
            return FragmentMoviesDetails().apply {
                arguments = Bundle().apply {
                    putParcelable("film", film)
                }
            }
        }
    }

    private val imageOption = RequestOptions()
        .placeholder(R.drawable.ic_avatar_placeholder)
        .fallback(R.drawable.ic_avatar_placeholder)
}
