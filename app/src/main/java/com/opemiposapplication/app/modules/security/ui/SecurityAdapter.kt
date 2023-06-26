package com.opemiposapplication.app.modules.security.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.databinding.RowSecurityBinding
import com.opemiposapplication.app.modules.security.`data`.model.SecurityRowModel
import kotlin.Int
import kotlin.collections.List

class SecurityAdapter(
  var list: List<SecurityRowModel>
) : RecyclerView.Adapter<SecurityAdapter.RowSecurityVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSecurityVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_security,parent,false)
    return RowSecurityVH(view)
  }

  override fun onBindViewHolder(holder: RowSecurityVH, position: Int) {
    val securityRowModel = SecurityRowModel()
    // TODO uncomment following line after integration with data source
    // val securityRowModel = list[position]
    holder.binding.securityRowModel = securityRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SecurityRowModel>) {
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
      item: SecurityRowModel
    ) {
    }
  }

  inner class RowSecurityVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSecurityBinding = RowSecurityBinding.bind(itemView)
  }
}
