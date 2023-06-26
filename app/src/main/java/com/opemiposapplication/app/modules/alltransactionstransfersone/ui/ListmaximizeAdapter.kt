package com.opemiposapplication.app.modules.alltransactionstransfersone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.databinding.RowListmaximize7Binding
import com.opemiposapplication.app.modules.alltransactionstransfersone.`data`.model.Listmaximize7RowModel
import kotlin.Int
import kotlin.collections.List

class ListmaximizeAdapter(
  var list: List<Listmaximize7RowModel>
) : RecyclerView.Adapter<ListmaximizeAdapter.RowListmaximize7VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmaximize7VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmaximize7,parent,false)
    return RowListmaximize7VH(view)
  }

  override fun onBindViewHolder(holder: RowListmaximize7VH, position: Int) {
    val listmaximize7RowModel = Listmaximize7RowModel()
    // TODO uncomment following line after integration with data source
    // val listmaximize7RowModel = list[position]
    holder.binding.listmaximize7RowModel = listmaximize7RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listmaximize7RowModel>) {
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
      item: Listmaximize7RowModel
    ) {
    }
  }

  inner class RowListmaximize7VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmaximize7Binding = RowListmaximize7Binding.bind(itemView)
  }
}
