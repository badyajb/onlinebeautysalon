package com.example.hairstyle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val hairj = findViewById<View>(R.id.hairj) as ImageButton
        hairj.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(this@home,hair::class.java
                )
            )
        })
        val idnail = findViewById<View>(R.id.idnail) as ImageButton
        idnail.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(this@home,nails::class.java
                )
            )
        })
        val idmakeup = findViewById<View>(R.id.idmakeup) as ImageButton
        idmakeup.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(this@home,makeup::class.java
                )
            )
        })
    }
}