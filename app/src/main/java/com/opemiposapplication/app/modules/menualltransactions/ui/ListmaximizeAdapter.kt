package com.opemiposapplication.app.modules.menualltransactions.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.databinding.RowListmaximize4Binding
import com.opemiposapplication.app.modules.menualltransactions.`data`.model.Listmaximize4RowModel
import kotlin.Int
import kotlin.collections.List

class ListmaximizeAdapter(
  var list: List<Listmaximize4RowModel>
) : RecyclerView.Adapter<ListmaximizeAdapter.RowListmaximize4VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmaximize4VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmaximize4,parent,false)
    return RowListmaximize4VH(view)
  }

  override fun onBindViewHolder(holder: RowListmaximize4VH, position: Int) {
    val listmaximize4RowModel = Listmaximize4RowModel()
    // TODO uncomment following line after integration with data source
    // val listmaximize4RowModel = list[position]
    holder.binding.listmaximize4RowModel = listmaximize4RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listmaximize4RowModel>) {
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
      item: Listmaximize4RowModel
    ) {
    }
  }

  inner class RowListmaximize4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmaximize4Binding = RowListmaximize4Binding.bind(itemView)
  }
}
