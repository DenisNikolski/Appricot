package com.example.appricot.data.models

import android.os.Parcel
import android.os.Parcelable

data class Film(
    val id: Int,
    val name: String?,
    val poster: String?,
    val backdrop: String?,
    val genres: List<Genre>,
    val rating: Float,
    val ageRate: Int,
    val reviewsAmount: Int,
    val length: Int,
    val description: String?,
    val actors: List<Actor>
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        arrayListOf<Genre>().apply {
            parcel.readList(this, Genre::class.java.classLoader)
        },
        parcel.readFloat(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString(),
        arrayListOf<Actor>().apply {
            parcel.readList(this, Actor::class.java.classLoader)
        }
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(name)
        parcel.writeString(poster)
        parcel.writeString(backdrop)
        parcel.writeList(genres)
        parcel.writeFloat(rating)
        parcel.writeInt(ageRate)
        parcel.writeInt(reviewsAmount)
        parcel.writeInt(length)
        parcel.writeString(description)
        parcel.writeList(actors)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Film> {
        override fun createFromParcel(parcel: Parcel): Film {
            return Film(parcel)
        }

        override fun newArray(size: Int): Array<Film?> {
            return arrayOfNulls(size)
        }
    }
}
