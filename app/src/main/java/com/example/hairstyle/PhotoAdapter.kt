package com.example.hairstyle

import android.content.Context
import android.icu.text.Transliterator.Position
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*

class PhotoAdapter(var context : Context): Adapter<PhotoAdapter.ViewHolder>() {
    var dataList = emptyList<DataModel>()
    internal fun SetDataList(dataList : List<DataModel>){
        this.dataList = dataList
        notifyDataSetChanged()
    }
    class ViewHolder (itemView : View):RecyclerView.ViewHolder(itemView){
        lateinit var imaggge : ImageView
        lateinit var title : TextView
        lateinit var desc  : TextView
        init {

            imaggge = itemView.findViewById(R.id.imaggge)
            title = itemView.findViewById(R.id.title)
            desc = itemView.findViewById(R.id.desc)
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.photo_layout ,parent,false)
        return ViewHolder(view)
    }
    override fun getItemCount() = dataList.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       var data = dataList[position]
        holder.title.text = data.title
        holder.desc.text = data.desc
        holder.imaggge.setImageResource(data.imaggge)

    }


}







