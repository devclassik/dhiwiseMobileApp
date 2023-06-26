package com.opemiposapplication.app.modules.menusupport.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.databinding.RowMenuSupportBinding
import com.opemiposapplication.app.modules.menusupport.`data`.model.MenuSupportRowModel
import kotlin.Int
import kotlin.collections.List

class MenuSupportAdapter(
  var list: List<MenuSupportRowModel>
) : RecyclerView.Adapter<MenuSupportAdapter.RowMenuSupportVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMenuSupportVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_menu_support,parent,false)
    return RowMenuSupportVH(view)
  }

  override fun onBindViewHolder(holder: RowMenuSupportVH, position: Int) {
    val menuSupportRowModel = MenuSupportRowModel()
    // TODO uncomment following line after integration with data source
    // val menuSupportRowModel = list[position]
    holder.binding.menuSupportRowModel = menuSupportRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MenuSupportRowModel>) {
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
      item: MenuSupportRowModel
    ) {
    }
  }

  inner class RowMenuSupportVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMenuSupportBinding = RowMenuSupportBinding.bind(itemView)
  }
}
