package com.example.hairstyle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class come_back : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_come_back)
        val backid  = findViewById<View>(R.id.backid) as ImageButton
        backid.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this@come_back,home::class.java))
        })
    }
}