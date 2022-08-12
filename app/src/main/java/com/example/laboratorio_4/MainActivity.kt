package com.example.laboratorio_4

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button1)
        initListeners();
    }
    private fun initListeners() {
        button.setOnClickListener {
            Toast.makeText(applicationContext, "Andrea Ximena Ramirez Recinos", Toast.LENGTH_LONG).show()
        }
    }
}
