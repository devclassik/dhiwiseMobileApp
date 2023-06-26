package com.opemiposapplication.app.modules.dashboardbusiness.ui

import android.view.View
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityDashboardBusinessBinding
import com.opemiposapplication.app.modules.dashboardbusiness.`data`.model.Listmaximize1RowModel
import com.opemiposapplication.app.modules.dashboardbusiness.`data`.model.SpinnerDropdownModel
import com.opemiposapplication.app.modules.dashboardbusiness.`data`.viewmodel.DashboardBusinessVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DashboardBusinessActivity :
    BaseActivity<ActivityDashboardBusinessBinding>(R.layout.activity_dashboard_business) {
  private val viewModel: DashboardBusinessVM by viewModels<DashboardBusinessVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerDropdownList.value = mutableListOf(
    SpinnerDropdownModel("Item1"),
    SpinnerDropdownModel("Item2"),
    SpinnerDropdownModel("Item3"),
    SpinnerDropdownModel("Item4"),
    SpinnerDropdownModel("Item5")
    )
    val spinnerDropdownAdapter =
    SpinnerDropdownAdapter(this,R.layout.spinner_item,viewModel.spinnerDropdownList.value?:
    mutableListOf())
    binding.spinnerDropdown.adapter = spinnerDropdownAdapter
    val listmaximizeAdapter =
    ListmaximizeAdapter(viewModel.listmaximizeList.value?:mutableListOf())
    binding.recyclerListmaximize.adapter = listmaximizeAdapter
    listmaximizeAdapter.setOnItemClickListener(
    object : ListmaximizeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listmaximize1RowModel) {
        onClickRecyclerListmaximize(view, position, item)
      }
    }
    )
    viewModel.listmaximizeList.observe(this) {
      listmaximizeAdapter.updateData(it)
    }
    binding.dashboardBusinessVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListmaximize(
    view: View,
    position: Int,
    item: Listmaximize1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DASHBOARD_BUSINESS_ACTIVITY"

  }
}
