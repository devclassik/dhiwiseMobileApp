package com.opemiposapplication.app.modules.alltransactionspostransactions.ui

import android.view.View
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityAllTransactionsPosTransactionsBinding
import com.opemiposapplication.app.modules.alltransactionspostransactions.`data`.model.ListiconsaxlinearOne2RowModel
import com.opemiposapplication.app.modules.alltransactionspostransactions.`data`.model.SpinnerLanguageModel
import com.opemiposapplication.app.modules.alltransactionspostransactions.`data`.viewmodel.AllTransactionsPosTransactionsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AllTransactionsPosTransactionsActivity :
    BaseActivity<ActivityAllTransactionsPosTransactionsBinding>(R.layout.activity_all_transactions_pos_transactions)
    {
  private val viewModel: AllTransactionsPosTransactionsVM by
      viewModels<AllTransactionsPosTransactionsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerLanguageList.value = mutableListOf(
    SpinnerLanguageModel("Item1"),
    SpinnerLanguageModel("Item2"),
    SpinnerLanguageModel("Item3"),
    SpinnerLanguageModel("Item4"),
    SpinnerLanguageModel("Item5")
    )
    val spinnerLanguageAdapter =
    SpinnerLanguageAdapter(this,R.layout.spinner_item,viewModel.spinnerLanguageList.value?:
    mutableListOf())
    binding.spinnerLanguage.adapter = spinnerLanguageAdapter
    val listiconsaxlinearOneAdapter =
    ListiconsaxlinearOneAdapter(viewModel.listiconsaxlinearOneList.value?:mutableListOf())
    binding.recyclerListiconsaxlinearOne.adapter = listiconsaxlinearOneAdapter
    listiconsaxlinearOneAdapter.setOnItemClickListener(
    object : ListiconsaxlinearOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListiconsaxlinearOne2RowModel) {
        onClickRecyclerListiconsaxlinearOne(view, position, item)
      }
    }
    )
    viewModel.listiconsaxlinearOneList.observe(this) {
      listiconsaxlinearOneAdapter.updateData(it)
    }
    binding.allTransactionsPosTransactionsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListiconsaxlinearOne(
    view: View,
    position: Int,
    item: ListiconsaxlinearOne2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ALL_TRANSACTIONS_POS_TRANSACTIONS_ACTIVITY"

  }
}
