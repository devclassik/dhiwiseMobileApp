package com.opemiposapplication.app.modules.menudashboardone.ui

import android.view.View
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityMenuDashboardOneBinding
import com.opemiposapplication.app.modules.menudashboardone.`data`.model.Listmaximize2RowModel
import com.opemiposapplication.app.modules.menudashboardone.`data`.viewmodel.MenuDashboardOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MenuDashboardOneActivity :
    BaseActivity<ActivityMenuDashboardOneBinding>(R.layout.activity_menu_dashboard_one) {
  private val viewModel: MenuDashboardOneVM by viewModels<MenuDashboardOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listmaximizeAdapter =
    ListmaximizeAdapter(viewModel.listmaximizeList.value?:mutableListOf())
    binding.recyclerListmaximize.adapter = listmaximizeAdapter
    listmaximizeAdapter.setOnItemClickListener(
    object : ListmaximizeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listmaximize2RowModel) {
        onClickRecyclerListmaximize(view, position, item)
      }
    }
    )
    viewModel.listmaximizeList.observe(this) {
      listmaximizeAdapter.updateData(it)
    }
    binding.menuDashboardOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListmaximize(
    view: View,
    position: Int,
    item: Listmaximize2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MENU_DASHBOARD_ONE_ACTIVITY"

  }
}
