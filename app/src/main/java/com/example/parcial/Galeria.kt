package com.example.parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Galeria : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeria)
        camara()
    }

    fun camara() {
        val bot = findViewById<Button>(R.id.btn_camara)

        bot.setOnClickListener() {

            val saltar: Intent = Intent(this, Galeria::class.java)
            startActivity(saltar)
        }
    }
}