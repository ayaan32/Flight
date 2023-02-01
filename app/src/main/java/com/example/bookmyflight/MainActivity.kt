package com.example.bookmyflight

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var et_user_name = findViewById(R.id.et_user_name) as EditText
        var et_password = findViewById(R.id.et_password) as EditText
        val signInButton = findViewById<Button>(R.id.signInButton)

        signInButton.setOnClickListener {
            Toast.makeText(this, "Button 1 was clicked", Toast.LENGTH_SHORT).show()
        }
    }
}