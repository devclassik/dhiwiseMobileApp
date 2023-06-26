package com.opemiposapplication.app.modules.securitytwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.databinding.RowSecurityTwoBinding
import com.opemiposapplication.app.modules.securitytwo.`data`.model.SecurityTwoRowModel
import kotlin.Int
import kotlin.collections.List

class SecurityTwoAdapter(
  var list: List<SecurityTwoRowModel>
) : RecyclerView.Adapter<SecurityTwoAdapter.RowSecurityTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSecurityTwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_security_two,parent,false)
    return RowSecurityTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowSecurityTwoVH, position: Int) {
    val securityTwoRowModel = SecurityTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val securityTwoRowModel = list[position]
    holder.binding.securityTwoRowModel = securityTwoRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SecurityTwoRowModel>) {
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
      item: SecurityTwoRowModel
    ) {
    }
  }

  inner class RowSecurityTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSecurityTwoBinding = RowSecurityTwoBinding.bind(itemView)
  }
}
