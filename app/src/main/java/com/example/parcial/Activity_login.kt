package com.example.parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity_login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        login()
    }

    fun login (){
        val bot = findViewById<Button>(R.id.btn_login)
        bot.setOnClickListener(){

            val saltar: Intent = Intent(this, Activity_login::class.java)
            startActivity(saltar)
        }
    }
}
