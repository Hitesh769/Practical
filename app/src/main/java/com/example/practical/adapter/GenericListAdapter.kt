package com.example.practical.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList
import com.example.practical.BR
/*This GenericAdapter is common for whole app*/
open class GenericListAdapter<T : Any>(
    var itemList: ArrayList<T>,
    val layout_id: Int,
    private val listItemClickListener: OnListItemClickListener<T>
) :
    RecyclerView.Adapter<GenericListAdapter.GenericViewHolder>() {

    // val viewBinderHelper = ViewBinderHelper()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenericViewHolder {
        var binding: ViewDataBinding =
            DataBindingUtil.inflate(LayoutInflater.from(parent?.context), layout_id, parent, false)
        return GenericViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    /* fun setSwipeRevealOpenOnlyOne() {
         viewBinderHelper.setOpenOnlyOne(true)
     }*/
/*set position for all variable so that we can use it*/
    override fun onBindViewHolder(holder: GenericViewHolder, position: Int) {
        val listItem = itemList.get(position)

        holder.itemView.setTag(position)
        holder?.binding?.setVariable(BR.itemClickListener, listItemClickListener)
        holder?.binding?.setVariable(BR.listitem, listItem)
        holder?.binding?.setVariable(BR.position, position)
        holder.binding.executePendingBindings()
    }

    interface OnListItemClickListener<T> {
        fun onListItemClicked(selItem: T, extra: Any?, position: Int)
    }


    class GenericViewHolder(binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {
        var binding: ViewDataBinding

        init {
            this.binding = binding
            this.binding.executePendingBindings()
        }
    }
/*for search any text*/



    override fun onViewAttachedToWindow(holder: GenericViewHolder) {
        super.onViewAttachedToWindow(holder)
    }

}