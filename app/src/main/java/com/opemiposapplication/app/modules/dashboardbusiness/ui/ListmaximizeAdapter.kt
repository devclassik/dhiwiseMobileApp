package com.opemiposapplication.app.modules.dashboardbusiness.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.databinding.RowListmaximize1Binding
import com.opemiposapplication.app.modules.dashboardbusiness.`data`.model.Listmaximize1RowModel
import kotlin.Int
import kotlin.collections.List

class ListmaximizeAdapter(
  var list: List<Listmaximize1RowModel>
) : RecyclerView.Adapter<ListmaximizeAdapter.RowListmaximize1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmaximize1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmaximize1,parent,false)
    return RowListmaximize1VH(view)
  }

  override fun onBindViewHolder(holder: RowListmaximize1VH, position: Int) {
    val listmaximize1RowModel = Listmaximize1RowModel()
    // TODO uncomment following line after integration with data source
    // val listmaximize1RowModel = list[position]
    holder.binding.listmaximize1RowModel = listmaximize1RowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listmaximize1RowModel>) {
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
      item: Listmaximize1RowModel
    ) {
    }
  }

  inner class RowListmaximize1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmaximize1Binding = RowListmaximize1Binding.bind(itemView)
  }
}
