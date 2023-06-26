package com.opemiposapplication.app.modules.securityone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.databinding.RowSecurityOneBinding
import com.opemiposapplication.app.modules.securityone.`data`.model.SecurityOneRowModel
import kotlin.Int
import kotlin.collections.List

class SecurityOneAdapter(
  var list: List<SecurityOneRowModel>
) : RecyclerView.Adapter<SecurityOneAdapter.RowSecurityOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSecurityOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_security_one,parent,false)
    return RowSecurityOneVH(view)
  }

  override fun onBindViewHolder(holder: RowSecurityOneVH, position: Int) {
    val securityOneRowModel = SecurityOneRowModel()
    // TODO uncomment following line after integration with data source
    // val securityOneRowModel = list[position]
    holder.binding.securityOneRowModel = securityOneRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SecurityOneRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: SecurityOneRowModel
    ) {
    }
  }

  inner class RowSecurityOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSecurityOneBinding = RowSecurityOneBinding.bind(itemView)
  }
}
