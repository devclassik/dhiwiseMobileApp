package com.opemiposapplication.app.modules.menudashboard.ui

import android.view.View
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityMenuDashboardBinding
import com.opemiposapplication.app.modules.menudashboard.`data`.model.ListmaximizeRowModel
import com.opemiposapplication.app.modules.menudashboard.`data`.viewmodel.MenuDashboardVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MenuDashboardActivity :
    BaseActivity<ActivityMenuDashboardBinding>(R.layout.activity_menu_dashboard) {
  private val viewModel: MenuDashboardVM by viewModels<MenuDashboardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listmaximizeAdapter =
    ListmaximizeAdapter(viewModel.listmaximizeList.value?:mutableListOf())
    binding.recyclerListmaximize.adapter = listmaximizeAdapter
    listmaximizeAdapter.setOnItemClickListener(
    object : ListmaximizeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListmaximizeRowModel) {
        onClickRecyclerListmaximize(view, position, item)
      }
    }
    )
    viewModel.listmaximizeList.observe(this) {
      listmaximizeAdapter.updateData(it)
    }
    binding.menuDashboardVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListmaximize(
    view: View,
    position: Int,
    item: ListmaximizeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MENU_DASHBOARD_ACTIVITY"

  }
}
