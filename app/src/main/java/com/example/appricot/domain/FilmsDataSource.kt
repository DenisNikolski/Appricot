package com.example.appricot.domain

import com.example.appricot.data.models.Film

class FilmsDataSource {
    fun getFilms(): List<Film> {
        return listOf(
            Film(
                id = 1,
                name = "Avengers: End Game",
                img_source = "https://m.media-amazon.com/images/M/MV5BMTc5MDE2ODcwNV5BMl5BanBnXkFtZTgwMzI2NzQ2NzM@._V1_FMjpg_UY691_.jpg",
                genres = listOf("Action", "Adventure", "Fantasy"),
                rating = 3.5F,
                ageRate = "16+",
                reviewsAmount = 111,
                length = 112,
                description = "After the devastating events of Avengers: Infinity War, the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos\\' actions and restore balance to the universe.",
                actors = ActorsDataSource().getActors()
            ),
            Film(
                id = 2,
                name = "Kynodontas",
                img_source = "https://m.media-amazon.com/images/M/MV5BMjIyOTkyMDE5N15BMl5BanBnXkFtZTcwNjIwNzQwMw@@._V1_FMjpg_UY428_.jpg",
                genres = listOf("Drama", "Thriller"),
                rating = 3.5F,
                ageRate = "16+",
                reviewsAmount = 221,
                length = 222,
                description = "Three teenagers are confined to an isolated country estate that could very well be on another planet. The trio spend their days listening to endless homemade tapes that teach them a whole new vocabulary. Any word that comes from beyond their family abode is instantly assigned a new meaning.",
                actors = ActorsDataSource().getActors()
            ),
            Film(
                id = 3,
                name = "The Lobster",
                img_source = "https://m.media-amazon.com/images/M/MV5BNDQ1NDE5NzQ1NF5BMl5BanBnXkFtZTgwNzA5OTM2NTE@._V1_FMjpg_UY722_.jpg",
                genres = listOf("Comedy", "Drama", "Romance"),
                rating = 5F,
                ageRate = "16+",
                reviewsAmount = 332,
                length = 333,
                description = "In a dystopian near future, single people, according to the laws of The City, are taken to The Hotel, where they are obliged to find a romantic partner in forty-five days or are transformed into beasts and sent off into The Woods.",
                actors = ActorsDataSource().getActors()
            ),
            Film(
                id = 4,
                name = "The Killing of a Sacred Deer",
                img_source = "https://m.media-amazon.com/images/M/MV5BMjU4NDcwOTA2NF5BMl5BanBnXkFtZTgwMjE2OTg4MzI@._V1_FMjpg_UY691_.jpg",
                genres = listOf("Horror", "Drama", "Mystery"),
                rating = 5F,
                ageRate = "18+",
                reviewsAmount = 332,
                length = 444,
                description = "Steven, a charismatic surgeon, is forced to make an unthinkable sacrifice after his life starts to fall apart, when the behavior of a teenage boy he has taken under his wing turns sinister.",
                actors = ActorsDataSource().getActors()
            ),
            Film(
                id = 4,
                name = "The Killing of a Sacred Deer",
                img_source = "https://m.media-amazon.com/images/M/MV5BMjU4NDcwOTA2NF5BMl5BanBnXkFtZTgwMjE2OTg4MzI@._V1_FMjpg_UY691_.jpg",
                genres = listOf("Horror", "Drama", "Mystery"),
                rating = 5F,
                ageRate = "18+",
                reviewsAmount = 332,
                length = 444,
                description = "Steven, a charismatic surgeon, is forced to make an unthinkable sacrifice after his life starts to fall apart, when the behavior of a teenage boy he has taken under his wing turns sinister.",
                actors = ActorsDataSource().getActors()
            )
        )
    }
}
