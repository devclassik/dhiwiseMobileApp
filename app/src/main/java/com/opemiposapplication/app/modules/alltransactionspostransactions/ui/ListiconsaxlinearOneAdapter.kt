package com.opemiposapplication.app.modules.alltransactionspostransactions.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.databinding.RowListiconsaxlinearOne2Binding
import com.opemiposapplication.app.modules.alltransactionspostransactions.`data`.model.ListiconsaxlinearOne2RowModel
import kotlin.Int
import kotlin.collections.List

class ListiconsaxlinearOneAdapter(
  var list: List<ListiconsaxlinearOne2RowModel>
) : RecyclerView.Adapter<ListiconsaxlinearOneAdapter.RowListiconsaxlinearOne2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListiconsaxlinearOne2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listiconsaxlinear_one2,parent,false)
    return RowListiconsaxlinearOne2VH(view)
  }

  override fun onBindViewHolder(holder: RowListiconsaxlinearOne2VH, position: Int) {
    val listiconsaxlinearOne2RowModel = ListiconsaxlinearOne2RowModel()
    // TODO uncomment following line after integration with data source
    // val listiconsaxlinearOne2RowModel = list[position]
    holder.binding.listiconsaxlinearOne2RowModel = listiconsaxlinearOne2RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListiconsaxlinearOne2RowModel>) {
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
      item: ListiconsaxlinearOne2RowModel
    ) {
    }
  }

  inner class RowListiconsaxlinearOne2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListiconsaxlinearOne2Binding = RowListiconsaxlinearOne2Binding.bind(itemView)
  }
}
