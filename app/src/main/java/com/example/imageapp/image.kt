package com.example.imageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class image : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)
        val viewer=findViewById<ImageView>(R.id.imageView2)
        val url=intent.getStringExtra("url")
        Glide.with(this).load(url).into(viewer)
    }
}