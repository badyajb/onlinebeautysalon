package com.example.hairstyle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class booking : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking)
        val validate = findViewById<View>(R.id.validate) as ImageButton
        validate.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(this@booking,come_back::class.java
                )
            )
        })
    }
}