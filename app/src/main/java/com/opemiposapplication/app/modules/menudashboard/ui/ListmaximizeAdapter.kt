package com.opemiposapplication.app.modules.menudashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.databinding.RowListmaximizeBinding
import com.opemiposapplication.app.modules.menudashboard.`data`.model.ListmaximizeRowModel
import kotlin.Int
import kotlin.collections.List

class ListmaximizeAdapter(
  var list: List<ListmaximizeRowModel>
) : RecyclerView.Adapter<ListmaximizeAdapter.RowListmaximizeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmaximizeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmaximize,parent,false)
    return RowListmaximizeVH(view)
  }

  override fun onBindViewHolder(holder: RowListmaximizeVH, position: Int) {
    val listmaximizeRowModel = ListmaximizeRowModel()
    // TODO uncomment following line after integration with data source
    // val listmaximizeRowModel = list[position]
    holder.binding.listmaximizeRowModel = listmaximizeRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListmaximizeRowModel>) {
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
      item: ListmaximizeRowModel
    ) {
    }
  }

  inner class RowListmaximizeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmaximizeBinding = RowListmaximizeBinding.bind(itemView)
  }
}
