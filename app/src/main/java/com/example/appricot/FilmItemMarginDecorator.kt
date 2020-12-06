package com.example.appricot

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class FilmItemMarginDecorator(private val spaceHeight: Int) : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect, view: View,
        parent: RecyclerView, state: RecyclerView.State
    ) {
        with(outRect) {
            if (parent.getChildAdapterPosition(view) % 2 != 0) left = spaceHeight
            top = spaceHeight
        }
    }
}
