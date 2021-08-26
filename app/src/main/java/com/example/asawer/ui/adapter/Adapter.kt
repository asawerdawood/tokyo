package com.example.asawer.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.asawer.R
import com.example.asawer.data.City
import com.example.asawer.databinding.LayoutBinding

class Adapter (val list:List<City>, val context: Context)
    : RecyclerView.Adapter<Adapter.ViewHolder> (){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view =  LayoutInflater.from(parent.context).inflate(R.layout.layout,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount()= list.size






    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currenCity = list[position]

        holder.binding.apply {
            country.text=currenCity.country
            total.text=currenCity.total
            silver.text=currenCity.silver
            gold.text=currenCity.bronze

        }

    }


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val  binding = LayoutBinding.bind(itemView)

    }
}