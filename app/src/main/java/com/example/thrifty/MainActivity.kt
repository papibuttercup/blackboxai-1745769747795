package com.example.thrifty

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var shopAdapter: ShopAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val shops = listOf(
            Shop(1, "Thrift Shop A", "Baguio City", "\$10 - \$50", 4.5f),
            Shop(2, "Thrift Shop B", "Baguio City", "\$20 - \$60", 4.0f),
            Shop(3, "Thrift Shop C", "Baguio City", "\$15 - \$55", 4.7f)
        )

        shopAdapter = ShopAdapter(shops) { shop ->
            val intent = Intent(this, ShopDetailActivity::class.java)
            intent.putExtra("shop", shop)
            startActivity(intent)
        }
        recyclerView.adapter = shopAdapter
    }
}
