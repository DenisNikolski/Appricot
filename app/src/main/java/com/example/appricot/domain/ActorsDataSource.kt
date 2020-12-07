package com.example.appricot.domain

import com.example.appricot.data.models.Actor

class ActorsDataSource {
    fun getActors(): List<Actor> {
        return listOf(
            Actor(
                name = "Alicia Vikander",
                img = "https://image.ibb.co/nKNBrd/Alicia_Vikander.jpg"
            ),
            Actor(
                name = "Amanda Seyfried",
                img = "https://image.ibb.co/j142xJ/Amanda_Seyfried.jpg"
            ),
            Actor(name = "Anne Hathaway", img = "https://image.ibb.co/euy6Py/Anne_Hathaway.jpg"),
            Actor(name = "Emma Stone", img = "https://image.ibb.co/dJY6Py/Emma_Stone.jpg"),
            Actor(
                name = "Keira Knightley",
                img = "https://image.ibb.co/cxX0jy/Keira_Knightley.jpg"
            ),
            Actor(name = "George Clooney", img = "https://image.ibb.co/ce1t4y/George_Clooney.jpg"),
            Actor(name = "Lucy Liu", img = "https://image.ibb.co/dWurrd/Lucy_Liu.jpg"),
            Actor(
                name = "Matthew McConaughey",
                img = "https://image.ibb.co/e3JHWd/Matthew_Mc_Conaughey.jpg"
            ),
            Actor(name = "Morgan Freeman", img = "https://image.ibb.co/h9GhxJ/Morgan_Freeman.jpg"),
            Actor(name = "Ryan Gosling", img = "https://image.ibb.co/buLLjy/Ryan_Gosling.jpg"),
            Actor(name = "Will Smith", img = "https://image.ibb.co/gxoUcJ/Will_Smith.jpg"),
            Actor(name = "Robert de Niro", img = "https://image.ibb.co/e6T6Py/Robert_de_Niro.jpg"),
            Actor(name = "Zoe Saldana", img = "https://image.ibb.co/i9WRPy/Zoe_Saldana.jpg")
        )
    }
}
