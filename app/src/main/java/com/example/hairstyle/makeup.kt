package com.example.hairstyle

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class makeup : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var photoAdapter: PhotoAdapter
    private var dataList = mutableListOf<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makeup)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(applicationContext , 2)
        photoAdapter = PhotoAdapter(applicationContext)
        recyclerView.adapter = photoAdapter
        dataList.add(DataModel("glamour","Cute Makeup",R.drawable.apturemk))
        dataList.add(DataModel("trending","Best Makeup of 2023",R.drawable.apturemk1))
        dataList.add(DataModel("winter trend","Arab Makeup trending",R.drawable.apturemk3))
        dataList.add(DataModel("neon makeup"," soft makeup", R.drawable.mmmkk))
        dataList.add(DataModel("trends","Gorgeous eye",R.drawable.mmmkk))
        dataList.add(DataModel("summer makeup","Extra Glamour Makeup",R.drawable.apturemk6))
        dataList.add(DataModel("creation","makeup birthday",R.drawable.apturemk7))
        dataList.add(DataModel("night makeup","for all party",R.drawable.apturemk8))
        photoAdapter.SetDataList(dataList)

        val nl1  = findViewById<View>(R.id.nl1) as ImageButton
        nl1.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this@makeup,nails::class.java))
        })
        val hair1  = findViewById<View>(R.id.hair1) as ImageButton
        hair1.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this@makeup,hair::class.java))
        })
        val vf  = findViewById<View>(R.id.vf) as ImageButton
        vf.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this@makeup,hair::class.java))
        })
        val cal1  = findViewById<View>(R.id.cal1) as ImageButton
        cal1.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this@makeup,booking::class.java))
        })




    }

}