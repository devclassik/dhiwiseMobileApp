package com.opemiposapplication.app.modules.alltransactionsall.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.databinding.RowListmaximize5Binding
import com.opemiposapplication.app.modules.alltransactionsall.`data`.model.Listmaximize5RowModel
import kotlin.Int
import kotlin.collections.List

class ListmaximizeAdapter(
  var list: List<Listmaximize5RowModel>
) : RecyclerView.Adapter<ListmaximizeAdapter.RowListmaximize5VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmaximize5VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmaximize5,parent,false)
    return RowListmaximize5VH(view)
  }

  override fun onBindViewHolder(holder: RowListmaximize5VH, position: Int) {
    val listmaximize5RowModel = Listmaximize5RowModel()
    // TODO uncomment following line after integration with data source
    // val listmaximize5RowModel = list[position]
    holder.binding.listmaximize5RowModel = listmaximize5RowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listmaximize5RowModel>) {
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
      item: Listmaximize5RowModel
    ) {
    }
  }

  inner class RowListmaximize5VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmaximize5Binding = RowListmaximize5Binding.bind(itemView)
  }
}
