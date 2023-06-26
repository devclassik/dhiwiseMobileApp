package com.opemiposapplication.app.modules.securitythree.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.databinding.RowSecurityThreeBinding
import com.opemiposapplication.app.modules.securitythree.`data`.model.SecurityThreeRowModel
import kotlin.Int
import kotlin.collections.List

class SecurityThreeAdapter(
  var list: List<SecurityThreeRowModel>
) : RecyclerView.Adapter<SecurityThreeAdapter.RowSecurityThreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSecurityThreeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_security_three,parent,false)
    return RowSecurityThreeVH(view)
  }

  override fun onBindViewHolder(holder: RowSecurityThreeVH, position: Int) {
    val securityThreeRowModel = SecurityThreeRowModel()
    // TODO uncomment following line after integration with data source
    // val securityThreeRowModel = list[position]
    holder.binding.securityThreeRowModel = securityThreeRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SecurityThreeRowModel>) {
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
      item: SecurityThreeRowModel
    ) {
    }
  }

  inner class RowSecurityThreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSecurityThreeBinding = RowSecurityThreeBinding.bind(itemView)
  }
}
