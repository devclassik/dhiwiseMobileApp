package com.opemiposapplication.app.modules.alltransactionsphonepay.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.databinding.RowListiconsaxlinearOne3Binding
import com.opemiposapplication.app.modules.alltransactionsphonepay.`data`.model.ListiconsaxlinearOne3RowModel
import kotlin.Int
import kotlin.collections.List

class ListiconsaxlinearOneAdapter(
  var list: List<ListiconsaxlinearOne3RowModel>
) : RecyclerView.Adapter<ListiconsaxlinearOneAdapter.RowListiconsaxlinearOne3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListiconsaxlinearOne3VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listiconsaxlinear_one3,parent,false)
    return RowListiconsaxlinearOne3VH(view)
  }

  override fun onBindViewHolder(holder: RowListiconsaxlinearOne3VH, position: Int) {
    val listiconsaxlinearOne3RowModel = ListiconsaxlinearOne3RowModel()
    // TODO uncomment following line after integration with data source
    // val listiconsaxlinearOne3RowModel = list[position]
    holder.binding.listiconsaxlinearOne3RowModel = listiconsaxlinearOne3RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListiconsaxlinearOne3RowModel>) {
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
      item: ListiconsaxlinearOne3RowModel
    ) {
    }
  }

  inner class RowListiconsaxlinearOne3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListiconsaxlinearOne3Binding = RowListiconsaxlinearOne3Binding.bind(itemView)
  }
}
