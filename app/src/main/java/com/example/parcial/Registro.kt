package com.example.parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        registro()

    }

    fun registro() {
        val bot = findViewById<Button>(R.id.btn_registro)
        bot.setOnClickListener() {

            val saltar: Intent = Intent(this, Registro::class.java)
            startActivity(saltar)
        }
    }
}