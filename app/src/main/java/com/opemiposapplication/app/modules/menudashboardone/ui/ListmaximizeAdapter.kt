package com.opemiposapplication.app.modules.menudashboardone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.databinding.RowListmaximize2Binding
import com.opemiposapplication.app.modules.menudashboardone.`data`.model.Listmaximize2RowModel
import kotlin.Int
import kotlin.collections.List

class ListmaximizeAdapter(
  var list: List<Listmaximize2RowModel>
) : RecyclerView.Adapter<ListmaximizeAdapter.RowListmaximize2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmaximize2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmaximize2,parent,false)
    return RowListmaximize2VH(view)
  }

  override fun onBindViewHolder(holder: RowListmaximize2VH, position: Int) {
    val listmaximize2RowModel = Listmaximize2RowModel()
    // TODO uncomment following line after integration with data source
    // val listmaximize2RowModel = list[position]
    holder.binding.listmaximize2RowModel = listmaximize2RowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listmaximize2RowModel>) {
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
      item: Listmaximize2RowModel
    ) {
    }
  }

  inner class RowListmaximize2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmaximize2Binding = RowListmaximize2Binding.bind(itemView)
  }
}
