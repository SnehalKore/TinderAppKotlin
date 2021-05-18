package com.example.navigationarchitecturewithkotlin.views.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationarchitecturewithkotlin.R
import com.example.navigationarchitecturewithkotlin.databinding.ListRowBinding
import com.example.navigationarchitecturewithkotlin.model.TinderMemberData
import com.example.navigationarchitecturewithkotlin.views.interfaces.MemberListAdapterListener


class TinderMemberListAdapter() :
    ListAdapter<TinderMemberData, TinderMemberListAdapter.MyViewHolder>(TinderMemberDiffCallback()) {
    private var layoutInflater: LayoutInflater? = null
    private lateinit var listener: MemberListAdapterListener
    private lateinit var context: Context

    constructor(
        context: Context
    ) : this() {
        this.context = context
    }

    inner class MyViewHolder(val binding: ListRowBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.context)
        }
        val binding = DataBindingUtil.inflate<ListRowBinding>(
            layoutInflater!!,
            R.layout.list_row,
            parent,
            false
        )
        binding.callback = listener
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.member = getItem(position)
        holder.binding.accept.visibility = View.VISIBLE
        holder.binding.reject.visibility = View.VISIBLE
        holder.binding.memberStatus.visibility = View.GONE
        getItem(position)._status?.let {
            holder.binding.memberStatus.text = getItem(position)._status
            if (getItem(position)._status.equals(context.getString(R.string.not_updated))) {
                holder.binding.accept.visibility = View.VISIBLE
                holder.binding.reject.visibility = View.VISIBLE
                holder.binding.memberStatus.visibility = View.GONE
            } else {
                holder.binding.accept.visibility = View.GONE
                holder.binding.reject.visibility = View.GONE
                holder.binding.memberStatus.visibility = View.VISIBLE
            }
        }

    }

    fun setListener(listener: MemberListAdapterListener) {
        this.listener = listener
    }

}

class TinderMemberDiffCallback : DiffUtil.ItemCallback<TinderMemberData>() {
    override fun areItemsTheSame(oldItem: TinderMemberData, newItem: TinderMemberData): Boolean {
        return oldItem.login.uuid == newItem.login.uuid
    }

    override fun areContentsTheSame(oldItem: TinderMemberData, newItem: TinderMemberData): Boolean {
        return oldItem == newItem
    }
}