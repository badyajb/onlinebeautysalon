package com.example.hairstyle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class choice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice)
        val vdid = findViewById<View>(R.id.vdid) as ImageButton
        vdid.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this@choice, booking::class.java))
        })
        val edithair = findViewById<View>(R.id.edithair) as ImageButton
        edithair.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this@choice, hair::class.java))
        })
        val editnail = findViewById<View>(R.id.editnail) as ImageButton
        editnail.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this@choice, nails::class.java))
        })
        val editmake = findViewById<View>(R.id.editmake) as ImageButton
        editmake.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this@choice, makeup::class.java))
        })

    }
}