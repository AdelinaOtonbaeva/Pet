package com.example.pet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Intro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intro)
        val button = findViewById<Button>(R.id.signup)

        button.setOnClickListener {
            startActivity(Intent(this, SignUp::class.java))


        }
    }
}