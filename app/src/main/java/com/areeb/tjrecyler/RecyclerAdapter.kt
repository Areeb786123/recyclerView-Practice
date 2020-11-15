package com.areeb.tjrecyler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val items: ArrayList<String>): RecyclerView.Adapter<RecyclerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items_layout,parent, false)

        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val current_items = items[position]
        holder.titleView.text=current_items
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val titleView :TextView = itemView.findViewById(R.id.title)
}