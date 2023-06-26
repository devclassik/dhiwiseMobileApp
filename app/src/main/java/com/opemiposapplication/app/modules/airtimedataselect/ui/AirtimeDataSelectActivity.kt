package com.opemiposapplication.app.modules.airtimedataselect.ui

import android.view.View
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityAirtimeDataSelectBinding
import com.opemiposapplication.app.modules.airtimedataselect.`data`.model.ListcallRowModel
import com.opemiposapplication.app.modules.airtimedataselect.`data`.model.SpinnerGroup1669Model
import com.opemiposapplication.app.modules.airtimedataselect.`data`.viewmodel.AirtimeDataSelectVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AirtimeDataSelectActivity :
    BaseActivity<ActivityAirtimeDataSelectBinding>(R.layout.activity_airtime_data_select) {
  private val viewModel: AirtimeDataSelectVM by viewModels<AirtimeDataSelectVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroup1669List.value = mutableListOf(
    SpinnerGroup1669Model("Item1"),
    SpinnerGroup1669Model("Item2"),
    SpinnerGroup1669Model("Item3"),
    SpinnerGroup1669Model("Item4"),
    SpinnerGroup1669Model("Item5")
    )
    val spinnerGroup1669Adapter =
    SpinnerGroup1669Adapter(this,R.layout.spinner_item,viewModel.spinnerGroup1669List.value?:
    mutableListOf())
    binding.spinnerGroup1669.adapter = spinnerGroup1669Adapter
    val listcallAdapter = ListcallAdapter(viewModel.listcallList.value?:mutableListOf())
    binding.recyclerListcall.adapter = listcallAdapter
    listcallAdapter.setOnItemClickListener(
    object : ListcallAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListcallRowModel) {
        onClickRecyclerListcall(view, position, item)
      }
    }
    )
    viewModel.listcallList.observe(this) {
      listcallAdapter.updateData(it)
    }
    binding.airtimeDataSelectVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListcall(
    view: View,
    position: Int,
    item: ListcallRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "AIRTIME_DATA_SELECT_ACTIVITY"

  }
}
