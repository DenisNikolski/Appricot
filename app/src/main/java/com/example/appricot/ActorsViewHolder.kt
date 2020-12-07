package com.example.appricot

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.appricot.data.models.Actor

class ActorsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val image: ImageView = view.findViewById(R.id.image_actor)
    private val textView: TextView = view.findViewById(R.id.text_actor_name)

    fun onBind(actor: Actor?) {
        Glide.with(itemView.context)
            .load(actor?.img)
            .apply(imageOption)
            .into(image)
        textView.text = actor?.name
    }

    companion object {
        private val imageOption = RequestOptions()
            .placeholder(R.drawable.ic_avatar_placeholder)
            .fallback(R.drawable.ic_avatar_placeholder)
    }
}
