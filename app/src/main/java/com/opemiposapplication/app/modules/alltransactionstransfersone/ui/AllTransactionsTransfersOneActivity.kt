package com.opemiposapplication.app.modules.alltransactionstransfersone.ui

import android.view.View
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityAllTransactionsTransfersOneBinding
import com.opemiposapplication.app.modules.alltransactionstransfersone.`data`.model.Listmaximize7RowModel
import com.opemiposapplication.app.modules.alltransactionstransfersone.`data`.model.SpinnerFrame1656Model
import com.opemiposapplication.app.modules.alltransactionstransfersone.`data`.viewmodel.AllTransactionsTransfersOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AllTransactionsTransfersOneActivity :
    BaseActivity<ActivityAllTransactionsTransfersOneBinding>(R.layout.activity_all_transactions_transfers_one)
    {
  private val viewModel: AllTransactionsTransfersOneVM by
      viewModels<AllTransactionsTransfersOneVM>()

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
      override fun onItemClick(view:View, position:Int, item : Listmaximize7RowModel) {
        onClickRecyclerListmaximize(view, position, item)
      }
    }
    )
    viewModel.listmaximizeList.observe(this) {
      listmaximizeAdapter.updateData(it)
    }
    binding.allTransactionsTransfersOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListmaximize(
    view: View,
    position: Int,
    item: Listmaximize7RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ALL_TRANSACTIONS_TRANSFERS_ONE_ACTIVITY"

  }
}
