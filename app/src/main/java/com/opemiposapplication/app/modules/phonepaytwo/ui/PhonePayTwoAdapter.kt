package com.opemiposapplication.app.modules.phonepaytwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.databinding.RowPhonePayTwoBinding
import com.opemiposapplication.app.modules.phonepaytwo.`data`.model.PhonePayTwoRowModel
import kotlin.Int
import kotlin.collections.List

class PhonePayTwoAdapter(
  var list: List<PhonePayTwoRowModel>
) : RecyclerView.Adapter<PhonePayTwoAdapter.RowPhonePayTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPhonePayTwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_phone_pay_two,parent,false)
    return RowPhonePayTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowPhonePayTwoVH, position: Int) {
    val phonePayTwoRowModel = PhonePayTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val phonePayTwoRowModel = list[position]
    holder.binding.phonePayTwoRowModel = phonePayTwoRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PhonePayTwoRowModel>) {
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
      item: PhonePayTwoRowModel
    ) {
    }
  }

  inner class RowPhonePayTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPhonePayTwoBinding = RowPhonePayTwoBinding.bind(itemView)
  }
}
