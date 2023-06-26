package com.opemiposapplication.app.modules.menualltransactions.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.databinding.RowListiconsaxlinearFiveBinding
import com.opemiposapplication.app.modules.menualltransactions.`data`.model.ListiconsaxlinearFiveRowModel
import kotlin.Int
import kotlin.collections.List

class ListiconsaxlinearFiveAdapter(
  var list: List<ListiconsaxlinearFiveRowModel>
) : RecyclerView.Adapter<ListiconsaxlinearFiveAdapter.RowListiconsaxlinearFiveVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListiconsaxlinearFiveVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listiconsaxlinear_five,parent,false)
    return RowListiconsaxlinearFiveVH(view)
  }

  override fun onBindViewHolder(holder: RowListiconsaxlinearFiveVH, position: Int) {
    val listiconsaxlinearFiveRowModel = ListiconsaxlinearFiveRowModel()
    // TODO uncomment following line after integration with data source
    // val listiconsaxlinearFiveRowModel = list[position]
    holder.binding.listiconsaxlinearFiveRowModel = listiconsaxlinearFiveRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListiconsaxlinearFiveRowModel>) {
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
      item: ListiconsaxlinearFiveRowModel
    ) {
    }
  }

  inner class RowListiconsaxlinearFiveVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListiconsaxlinearFiveBinding = RowListiconsaxlinearFiveBinding.bind(itemView)
  }
}
