package com.example.pet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)
        val button = findViewById<Button>(R.id.signup)

        button.setOnClickListener {
            startActivity(Intent(this, MAinPage::class.java))
        }
    }
}