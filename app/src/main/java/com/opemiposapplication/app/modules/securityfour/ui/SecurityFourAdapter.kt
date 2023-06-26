package com.opemiposapplication.app.modules.securityfour.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.databinding.RowSecurityFourBinding
import com.opemiposapplication.app.modules.securityfour.`data`.model.SecurityFourRowModel
import kotlin.Int
import kotlin.collections.List

class SecurityFourAdapter(
  var list: List<SecurityFourRowModel>
) : RecyclerView.Adapter<SecurityFourAdapter.RowSecurityFourVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSecurityFourVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_security_four,parent,false)
    return RowSecurityFourVH(view)
  }

  override fun onBindViewHolder(holder: RowSecurityFourVH, position: Int) {
    val securityFourRowModel = SecurityFourRowModel()
    // TODO uncomment following line after integration with data source
    // val securityFourRowModel = list[position]
    holder.binding.securityFourRowModel = securityFourRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SecurityFourRowModel>) {
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
      item: SecurityFourRowModel
    ) {
    }
  }

  inner class RowSecurityFourVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSecurityFourBinding = RowSecurityFourBinding.bind(itemView)
  }
}
