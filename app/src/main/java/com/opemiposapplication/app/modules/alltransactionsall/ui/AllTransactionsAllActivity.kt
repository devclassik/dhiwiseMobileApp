package com.opemiposapplication.app.modules.alltransactionsall.ui

import android.view.View
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityAllTransactionsAllBinding
import com.opemiposapplication.app.modules.alltransactionsall.`data`.model.Listmaximize5RowModel
import com.opemiposapplication.app.modules.alltransactionsall.`data`.model.SpinnerFrame1656Model
import com.opemiposapplication.app.modules.alltransactionsall.`data`.viewmodel.AllTransactionsAllVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AllTransactionsAllActivity :
    BaseActivity<ActivityAllTransactionsAllBinding>(R.layout.activity_all_transactions_all) {
  private val viewModel: AllTransactionsAllVM by viewModels<AllTransactionsAllVM>()

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
    val listmaximizeAdapter =
    ListmaximizeAdapter(viewModel.listmaximizeList.value?:mutableListOf())
    binding.recyclerListmaximize.adapter = listmaximizeAdapter
    listmaximizeAdapter.setOnItemClickListener(
    object : ListmaximizeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listmaximize5RowModel) {
        onClickRecyclerListmaximize(view, position, item)
      }
    }
    )
    viewModel.listmaximizeList.observe(this) {
      listmaximizeAdapter.updateData(it)
    }
    binding.allTransactionsAllVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListmaximize(
    view: View,
    position: Int,
    item: Listmaximize5RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ALL_TRANSACTIONS_ALL_ACTIVITY"

  }
}
