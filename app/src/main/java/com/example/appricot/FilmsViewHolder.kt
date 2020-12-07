package com.example.appricot

import android.view.View
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.appricot.data.models.Film

class FilmsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val image: ImageView = view.findViewById(R.id.film_card_img)
    private val ageRate: TextView = view.findViewById(R.id.text_list_age_rate)
    private val genres: TextView = view.findViewById(R.id.text_tag_line)
    private val ratingBar: RatingBar = view.findViewById(R.id.rating_bar)
    private val reviewScore: TextView = view.findViewById(R.id.text_review_score)
    private val title: TextView = view.findViewById(R.id.text_card_film_title)
    private val length: TextView = view.findViewById(R.id.text_film_length)

    fun onBind(film: Film) {
        Glide.with(itemView.context)
            .load(film.img_source)
            .apply(imageOption)
            .into(image)

        ageRate.text = film.ageRate
        genres.text = film.genres.joinToString(", ")
        ratingBar.rating = film.rating
        reviewScore.text = itemView.context.getString(R.string.reviews, film.reviewsAmount)
        title.text = film.name
        length.text = itemView.context.getString(R.string.film_length, film.length)
    }

    companion object {
        private val imageOption = RequestOptions()
            .placeholder(R.drawable.ic_avatar_placeholder)
            .fallback(R.drawable.ic_avatar_placeholder)
            .centerCrop()
    }
}
