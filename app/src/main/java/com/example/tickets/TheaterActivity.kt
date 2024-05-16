package com.example.tickets

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TheaterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_theater)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        supportActionBar?.hide()
        homeListener()
        detailListener()
    }

    private fun homeListener() {
        val myButton = findViewById<ImageView>(R.id.botNavHomeTheater);
        myButton.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    private fun detailListener() {
        val myButton = findViewById<LinearLayout>(R.id.detailListener_1);
        myButton.setOnClickListener{
            startActivity(Intent(this, DetailTheaterActivity::class.java))
        }
    }
}