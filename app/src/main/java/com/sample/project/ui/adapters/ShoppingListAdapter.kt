package com.sample.project.ui.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.sample.project.R
import com.sample.project.ui.dto.ShoppingListDTO
import com.sample.project.ui.listeners.RecyclerViewClickListener
import java.text.SimpleDateFormat
import java.util.*


class ShoppingListAdapter(private val list: ArrayList<ShoppingListDTO>, val context: Context, private val listener: RecyclerViewClickListener) : RecyclerView.Adapter<ShoppingListAdapter.ViewHolder>() {

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val item = list.get(position)
        holder?.name?.text = item.name
        holder?.timestamp?.text = convertDateTime(item.timeStamp)
        holder?.completedShoppingListItems?.text = item.itemsCompletedCount.toString()
        holder?.allShoppingListItems?.text = item.itemsAllCount.toString()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent?.getContext())
                .inflate(R.layout.item_shopping_list, parent, false)
        return ViewHolder(itemView, listener)
    }


    inner class ViewHolder(view: View, clickListener: RecyclerViewClickListener) : RecyclerView.ViewHolder(view), View.OnClickListener {

        var name: TextView
        var timestamp: TextView
        var completedShoppingListItems: TextView
        var allShoppingListItems: TextView
        private var viewClickListener: RecyclerViewClickListener? = null


        init {
            name = view.findViewById(R.id.name)
            timestamp = view.findViewById(R.id.timestamp)
            completedShoppingListItems = view.findViewById(R.id.completedShoppingListItems)
            allShoppingListItems = view.findViewById(R.id.allShoppingListItems)
            viewClickListener = clickListener
            view.setOnClickListener(this)
        }

        override fun onClick(v: View) {
            viewClickListener?.onClick(v, adapterPosition)
        }
    }

    fun removeItem(position: Int) {
        list.removeAt(position)
        // notify the item removed by position
        // to perform recycler view delete animations
        // NOTE: don't call notifyDataSetChanged()
        notifyItemRemoved(position)
    }

    fun restoreItem(shoppingListItem: ShoppingListDTO, position: Int) {
        list.add(position, shoppingListItem)
        // notify shoppingListItem added by position
        notifyItemInserted(position)
    }

    private fun convertDateTime(date: Date): String? {
        val dateFormat = SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
        return dateFormat.format(date)
    }
}