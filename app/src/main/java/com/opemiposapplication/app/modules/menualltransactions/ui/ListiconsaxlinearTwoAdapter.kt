package com.opemiposapplication.app.modules.menualltransactions.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.databinding.RowListiconsaxlinearTwoBinding
import com.opemiposapplication.app.modules.menualltransactions.`data`.model.ListiconsaxlinearTwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListiconsaxlinearTwoAdapter(
  var list: List<ListiconsaxlinearTwoRowModel>
) : RecyclerView.Adapter<ListiconsaxlinearTwoAdapter.RowListiconsaxlinearTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListiconsaxlinearTwoVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listiconsaxlinear_two,parent,false)
    return RowListiconsaxlinearTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListiconsaxlinearTwoVH, position: Int) {
    val listiconsaxlinearTwoRowModel = ListiconsaxlinearTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listiconsaxlinearTwoRowModel = list[position]
    holder.binding.listiconsaxlinearTwoRowModel = listiconsaxlinearTwoRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListiconsaxlinearTwoRowModel>) {
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
      item: ListiconsaxlinearTwoRowModel
    ) {
    }
  }

  inner class RowListiconsaxlinearTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListiconsaxlinearTwoBinding = RowListiconsaxlinearTwoBinding.bind(itemView)
  }
}
