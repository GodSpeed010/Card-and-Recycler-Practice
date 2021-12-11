package com.example.cardandrecyclerpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class NameAdapter(private val names: List<String>, val clickListener: OnClickListener) : RecyclerView.Adapter<NameAdapter.NameViewHolder>() {

    interface OnClickListener {
        fun onItemClicked(position: Int)
    }

    inner class NameViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtName = itemView.findViewById(R.id.txtName) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.name_item, parent, false)
        return NameViewHolder(view)
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        val element = names[position]

        holder.txtName.text = element

        holder.txtName.setOnClickListener {
            clickListener.onItemClicked(position)
        }
    }

    override fun getItemCount(): Int {
        return names.size
    }

}