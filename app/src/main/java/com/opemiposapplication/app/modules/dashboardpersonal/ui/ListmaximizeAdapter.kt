package com.opemiposapplication.app.modules.dashboardpersonal.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.databinding.RowListmaximize3Binding
import com.opemiposapplication.app.modules.dashboardpersonal.`data`.model.Listmaximize3RowModel
import kotlin.Int
import kotlin.collections.List

class ListmaximizeAdapter(
  var list: List<Listmaximize3RowModel>
) : RecyclerView.Adapter<ListmaximizeAdapter.RowListmaximize3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmaximize3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmaximize3,parent,false)
    return RowListmaximize3VH(view)
  }

  override fun onBindViewHolder(holder: RowListmaximize3VH, position: Int) {
    val listmaximize3RowModel = Listmaximize3RowModel()
    // TODO uncomment following line after integration with data source
    // val listmaximize3RowModel = list[position]
    holder.binding.listmaximize3RowModel = listmaximize3RowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listmaximize3RowModel>) {
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
      item: Listmaximize3RowModel
    ) {
    }
  }

  inner class RowListmaximize3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmaximize3Binding = RowListmaximize3Binding.bind(itemView)
  }
}
