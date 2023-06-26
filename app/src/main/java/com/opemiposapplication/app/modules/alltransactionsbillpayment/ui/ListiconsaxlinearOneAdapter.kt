package com.opemiposapplication.app.modules.alltransactionsbillpayment.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.databinding.RowListiconsaxlinearOne1Binding
import com.opemiposapplication.app.modules.alltransactionsbillpayment.`data`.model.ListiconsaxlinearOne1RowModel
import kotlin.Int
import kotlin.collections.List

class ListiconsaxlinearOneAdapter(
  var list: List<ListiconsaxlinearOne1RowModel>
) : RecyclerView.Adapter<ListiconsaxlinearOneAdapter.RowListiconsaxlinearOne1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListiconsaxlinearOne1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listiconsaxlinear_one1,parent,false)
    return RowListiconsaxlinearOne1VH(view)
  }

  override fun onBindViewHolder(holder: RowListiconsaxlinearOne1VH, position: Int) {
    val listiconsaxlinearOne1RowModel = ListiconsaxlinearOne1RowModel()
    // TODO uncomment following line after integration with data source
    // val listiconsaxlinearOne1RowModel = list[position]
    holder.binding.listiconsaxlinearOne1RowModel = listiconsaxlinearOne1RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListiconsaxlinearOne1RowModel>) {
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
      item: ListiconsaxlinearOne1RowModel
    ) {
    }
  }

  inner class RowListiconsaxlinearOne1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListiconsaxlinearOne1Binding = RowListiconsaxlinearOne1Binding.bind(itemView)
  }
}
