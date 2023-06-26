package com.opemiposapplication.app.modules.alltransactionsairtimedata.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.databinding.RowListiconsaxlinearOneBinding
import com.opemiposapplication.app.modules.alltransactionsairtimedata.`data`.model.ListiconsaxlinearOneRowModel
import kotlin.Int
import kotlin.collections.List

class ListiconsaxlinearOneAdapter(
  var list: List<ListiconsaxlinearOneRowModel>
) : RecyclerView.Adapter<ListiconsaxlinearOneAdapter.RowListiconsaxlinearOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListiconsaxlinearOneVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listiconsaxlinear_one,parent,false)
    return RowListiconsaxlinearOneVH(view)
  }

  override fun onBindViewHolder(holder: RowListiconsaxlinearOneVH, position: Int) {
    val listiconsaxlinearOneRowModel = ListiconsaxlinearOneRowModel()
    // TODO uncomment following line after integration with data source
    // val listiconsaxlinearOneRowModel = list[position]
    holder.binding.listiconsaxlinearOneRowModel = listiconsaxlinearOneRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListiconsaxlinearOneRowModel>) {
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
      item: ListiconsaxlinearOneRowModel
    ) {
    }
  }

  inner class RowListiconsaxlinearOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListiconsaxlinearOneBinding = RowListiconsaxlinearOneBinding.bind(itemView)
  }
}
