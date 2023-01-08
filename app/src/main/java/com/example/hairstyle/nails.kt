package com.example.hairstyle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class nails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nails)

        val idarrow = findViewById<View>(R.id.idarrow) as ImageButton
        idarrow.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    this@nails, hair::class.java
                )
            )
        })

        val idbk2 = findViewById<View>(R.id.idbk2) as ImageButton
        idbk2.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(this@nails,booking::class.java
                )
            )
        })
        val idhair2 = findViewById<View>(R.id.idhair2) as ImageButton
        idhair2.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(this@nails,hair::class.java
                )
            )
        })
        val makeup2 = findViewById<View>(R.id.makeup2) as ImageButton
        makeup2.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(this@nails,makeup::class.java
                )
            )
        })
        val idval2 = findViewById<View>(R.id.idval2) as ImageButton
        idval2.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(this@nails,choice::class.java)
            )
        })


    }
}