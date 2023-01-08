package com.example.hairstyle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class hair : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hair)
        val arrow = findViewById<View>(R.id.arrow) as ImageButton
        arrow.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(this@hair,home::class.java
                )
            )
        })
        val idbk = findViewById<View>(R.id.idbk) as ImageButton
        idbk.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(this@hair,booking::class.java
                )
            )
        })
        val idval = findViewById<View>(R.id.idval) as ImageButton
        idval.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(this@hair,nails::class.java
                )
            )
        })
        val idnail1 = findViewById<View>(R.id.idnail1) as ImageButton
        idnail1.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(this@hair,nails::class.java
                )
            )
        })
        val idmakeup1 = findViewById<View>(R.id.idmakeup1) as ImageButton
        idmakeup1.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(this@hair,makeup::class.java
                )
            )
        })

    }
}