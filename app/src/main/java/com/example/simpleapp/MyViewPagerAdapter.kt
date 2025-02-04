package com.example.simpleapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MyViewPagerAdapter(private val data: List<VehicleCategory>) :
    RecyclerView.Adapter<MyViewPagerAdapter.PageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.page_layout, parent, false)
        return PageViewHolder(view)
    }

    override fun onBindViewHolder(holder: PageViewHolder, position: Int) {
        val category = data[position]
        holder.pageTitle.text = category.title

        holder.recyclerView.layoutManager = LinearLayoutManager(holder.recyclerView.context)
        holder.recyclerView.adapter = MyRecyclerViewAdapter(category.Vehicles)
    }

    override fun getItemCount(): Int = data.size

    class PageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val recyclerView: RecyclerView = itemView.findViewById(R.id.recyclerView)
        val pageTitle: TextView = itemView.findViewById(R.id.pageTitle)
    }
}
