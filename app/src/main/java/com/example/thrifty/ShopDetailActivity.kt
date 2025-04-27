package com.example.thrifty

import android.os.Bundle
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ShopDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop_detail)

        val shop = intent.getParcelableExtra<Shop>("shop")

        val nameTextView: TextView = findViewById(R.id.detailShopName)
        val locationTextView: TextView = findViewById(R.id.detailShopLocation)
        val priceRangeTextView: TextView = findViewById(R.id.detailPriceRange)
        val ratingBar: RatingBar = findViewById(R.id.detailRatingBar)

        if (shop != null) {
            nameTextView.text = shop.name
            locationTextView.text = shop.location
            priceRangeTextView.text = shop.priceRange
            ratingBar.rating = shop.rating
        }
    }
}
