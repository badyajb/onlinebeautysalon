package com.example.hairstyle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1  = findViewById<View>(R.id.button1) as Button
      button1.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this@MainActivity,signup::class.java))
        })
    }
}