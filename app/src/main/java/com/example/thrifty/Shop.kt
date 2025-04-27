package com.example.thrifty

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Shop(
    val id: Int,
    val name: String,
    val location: String,
    val priceRange: String,
    val rating: Float
) : Parcelable
