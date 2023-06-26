package com.opemiposapplication.app.modules.alltransactionstransfers.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.databinding.RowListmaximize6Binding
import com.opemiposapplication.app.modules.alltransactionstransfers.`data`.model.Listmaximize6RowModel
import kotlin.Int
import kotlin.collections.List

class ListmaximizeAdapter(
  var list: List<Listmaximize6RowModel>
) : RecyclerView.Adapter<ListmaximizeAdapter.RowListmaximize6VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmaximize6VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmaximize6,parent,false)
    return RowListmaximize6VH(view)
  }

  override fun onBindViewHolder(holder: RowListmaximize6VH, position: Int) {
    val listmaximize6RowModel = Listmaximize6RowModel()
    // TODO uncomment following line after integration with data source
    // val listmaximize6RowModel = list[position]
    holder.binding.listmaximize6RowModel = listmaximize6RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listmaximize6RowModel>) {
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
      item: Listmaximize6RowModel
    ) {
    }
  }

  inner class RowListmaximize6VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmaximize6Binding = RowListmaximize6Binding.bind(itemView)
  }
}
