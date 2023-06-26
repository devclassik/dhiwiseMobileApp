package com.opemiposapplication.app.modules.alltransactionstransfers.ui

import android.view.View
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityAllTransactionsTransfersBinding
import com.opemiposapplication.app.modules.alltransactionstransfers.`data`.model.Listmaximize6RowModel
import com.opemiposapplication.app.modules.alltransactionstransfers.`data`.model.SpinnerFrame1656Model
import com.opemiposapplication.app.modules.alltransactionstransfers.`data`.viewmodel.AllTransactionsTransfersVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AllTransactionsTransfersActivity :
    BaseActivity<ActivityAllTransactionsTransfersBinding>(R.layout.activity_all_transactions_transfers)
    {
  private val viewModel: AllTransactionsTransfersVM by viewModels<AllTransactionsTransfersVM>()

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
      override fun onItemClick(view:View, position:Int, item : Listmaximize6RowModel) {
        onClickRecyclerListmaximize(view, position, item)
      }
    }
    )
    viewModel.listmaximizeList.observe(this) {
      listmaximizeAdapter.updateData(it)
    }
    binding.allTransactionsTransfersVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListmaximize(
    view: View,
    position: Int,
    item: Listmaximize6RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ALL_TRANSACTIONS_TRANSFERS_ACTIVITY"

  }
}
