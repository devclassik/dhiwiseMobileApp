package com.opemiposapplication.app.modules.alltransactionsairtimedata.ui

import android.view.View
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityAllTransactionsAirtimeDataBinding
import com.opemiposapplication.app.modules.alltransactionsairtimedata.`data`.model.ListiconsaxlinearOneRowModel
import com.opemiposapplication.app.modules.alltransactionsairtimedata.`data`.model.SpinnerFrame1656Model
import com.opemiposapplication.app.modules.alltransactionsairtimedata.`data`.viewmodel.AllTransactionsAirtimeDataVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AllTransactionsAirtimeDataActivity :
    BaseActivity<ActivityAllTransactionsAirtimeDataBinding>(R.layout.activity_all_transactions_airtime_data)
    {
  private val viewModel: AllTransactionsAirtimeDataVM by viewModels<AllTransactionsAirtimeDataVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerFrame1656List.value = mutableListOf(
    SpinnerFrame1656Model("Item1"),
    SpinnerFrame1656Model("Item2"),
    SpinnerFrame1656Model("Item3"),
    SpinnerFrame1656Model("Item4"),
    SpinnerFrame1656Model("Item5")
    )
    val spinnerFrame1656Adapter =
    SpinnerFrame1656Adapter(this,R.layout.spinner_item,viewModel.spinnerFrame1656List.value?:
    mutableListOf())
    binding.spinnerFrame1656.adapter = spinnerFrame1656Adapter
    val listiconsaxlinearOneAdapter =
    ListiconsaxlinearOneAdapter(viewModel.listiconsaxlinearOneList.value?:mutableListOf())
    binding.recyclerListiconsaxlinearOne.adapter = listiconsaxlinearOneAdapter
    listiconsaxlinearOneAdapter.setOnItemClickListener(
    object : ListiconsaxlinearOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListiconsaxlinearOneRowModel) {
        onClickRecyclerListiconsaxlinearOne(view, position, item)
      }
    }
    )
    viewModel.listiconsaxlinearOneList.observe(this) {
      listiconsaxlinearOneAdapter.updateData(it)
    }
    binding.allTransactionsAirtimeDataVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListiconsaxlinearOne(
    view: View,
    position: Int,
    item: ListiconsaxlinearOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ALL_TRANSACTIONS_AIRTIME_DATA_ACTIVITY"

  }
}
