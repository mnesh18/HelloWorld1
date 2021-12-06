package com.example.helloworld1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var message = "Hello Muna ^^"
        Log.d("Main Activity", message)
        Log.d("MainActivity", "Your Message is: ${message.length} characters long")
        println("Hello World")
        println("2 * 3 / (1 +5) = ${4 * 4 / (1 + 15)}")
    }
}