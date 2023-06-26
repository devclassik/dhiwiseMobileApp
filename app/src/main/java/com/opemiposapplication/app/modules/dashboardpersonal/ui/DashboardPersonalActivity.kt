package com.opemiposapplication.app.modules.dashboardpersonal.ui

import android.view.View
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityDashboardPersonalBinding
import com.opemiposapplication.app.modules.dashboardpersonal.`data`.model.Listmaximize3RowModel
import com.opemiposapplication.app.modules.dashboardpersonal.`data`.model.SpinnerDropdownModel
import com.opemiposapplication.app.modules.dashboardpersonal.`data`.viewmodel.DashboardPersonalVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DashboardPersonalActivity :
    BaseActivity<ActivityDashboardPersonalBinding>(R.layout.activity_dashboard_personal) {
  private val viewModel: DashboardPersonalVM by viewModels<DashboardPersonalVM>()

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
      override fun onItemClick(view:View, position:Int, item : Listmaximize3RowModel) {
        onClickRecyclerListmaximize(view, position, item)
      }
    }
    )
    viewModel.listmaximizeList.observe(this) {
      listmaximizeAdapter.updateData(it)
    }
    binding.dashboardPersonalVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListmaximize(
    view: View,
    position: Int,
    item: Listmaximize3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DASHBOARD_PERSONAL_ACTIVITY"

  }
}
