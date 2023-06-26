package com.opemiposapplication.app.modules.pinlogin.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.databinding.RowPinLoginBinding
import com.opemiposapplication.app.modules.pinlogin.`data`.model.PinLoginRowModel
import kotlin.Int
import kotlin.collections.List

class PinLoginAdapter(
  var list: List<PinLoginRowModel>
) : RecyclerView.Adapter<PinLoginAdapter.RowPinLoginVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPinLoginVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_pin_login,parent,false)
    return RowPinLoginVH(view)
  }

  override fun onBindViewHolder(holder: RowPinLoginVH, position: Int) {
    val pinLoginRowModel = PinLoginRowModel()
    // TODO uncomment following line after integration with data source
    // val pinLoginRowModel = list[position]
    holder.binding.pinLoginRowModel = pinLoginRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PinLoginRowModel>) {
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
      item: PinLoginRowModel
    ) {
    }
  }

  inner class RowPinLoginVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPinLoginBinding = RowPinLoginBinding.bind(itemView)
  }
}
