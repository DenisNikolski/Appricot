package com.example.appricot.data.models

data class Film(
    val id: Int,
    val name: String,
    val img_source: String,
    val genres: List<String>,
    val rating: Float,
    val ageRate: String,
    val reviewsAmount: Int,
    val length: Int,
    val description: String,
    val actors: List<Actor>
)
