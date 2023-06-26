package com.opemiposapplication.app.modules.airtimedataselect.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.databinding.RowListcallBinding
import com.opemiposapplication.app.modules.airtimedataselect.`data`.model.ListcallRowModel
import kotlin.Int
import kotlin.collections.List

class ListcallAdapter(
  var list: List<ListcallRowModel>
) : RecyclerView.Adapter<ListcallAdapter.RowListcallVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListcallVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listcall,parent,false)
    return RowListcallVH(view)
  }

  override fun onBindViewHolder(holder: RowListcallVH, position: Int) {
    val listcallRowModel = ListcallRowModel()
    // TODO uncomment following line after integration with data source
    // val listcallRowModel = list[position]
    holder.binding.listcallRowModel = listcallRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListcallRowModel>) {
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
      item: ListcallRowModel
    ) {
    }
  }

  inner class RowListcallVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListcallBinding = RowListcallBinding.bind(itemView)
  }
}
