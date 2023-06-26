package com.opemiposapplication.app.modules.alltransactionsbillpayment.ui

import android.view.View
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityAllTransactionsBillPaymentBinding
import com.opemiposapplication.app.modules.alltransactionsbillpayment.`data`.model.ListiconsaxlinearOne1RowModel
import com.opemiposapplication.app.modules.alltransactionsbillpayment.`data`.model.SpinnerFrame1656Model
import com.opemiposapplication.app.modules.alltransactionsbillpayment.`data`.viewmodel.AllTransactionsBillPaymentVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AllTransactionsBillPaymentActivity :
    BaseActivity<ActivityAllTransactionsBillPaymentBinding>(R.layout.activity_all_transactions_bill_payment)
    {
  private val viewModel: AllTransactionsBillPaymentVM by viewModels<AllTransactionsBillPaymentVM>()

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
      override fun onItemClick(view:View, position:Int, item :
      ListiconsaxlinearOne1RowModel) {
        onClickRecyclerListiconsaxlinearOne(view, position, item)
      }
    }
    )
    viewModel.listiconsaxlinearOneList.observe(this) {
      listiconsaxlinearOneAdapter.updateData(it)
    }
    binding.allTransactionsBillPaymentVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListiconsaxlinearOne(
    view: View,
    position: Int,
    item: ListiconsaxlinearOne1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ALL_TRANSACTIONS_BILL_PAYMENT_ACTIVITY"

  }
}
