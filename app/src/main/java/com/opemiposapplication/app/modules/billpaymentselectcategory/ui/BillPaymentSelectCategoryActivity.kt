package com.opemiposapplication.app.modules.billpaymentselectcategory.ui

import android.view.View
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityBillPaymentSelectCategoryBinding
import com.opemiposapplication.app.modules.billpaymentselectcategory.`data`.model.ListlockRowModel
import com.opemiposapplication.app.modules.billpaymentselectcategory.`data`.viewmodel.BillPaymentSelectCategoryVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class BillPaymentSelectCategoryActivity :
    BaseActivity<ActivityBillPaymentSelectCategoryBinding>(R.layout.activity_bill_payment_select_category)
    {
  private val viewModel: BillPaymentSelectCategoryVM by viewModels<BillPaymentSelectCategoryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listlockAdapter = ListlockAdapter(viewModel.listlockList.value?:mutableListOf())
    binding.recyclerListlock.adapter = listlockAdapter
    listlockAdapter.setOnItemClickListener(
    object : ListlockAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListlockRowModel) {
        onClickRecyclerListlock(view, position, item)
      }
    }
    )
    viewModel.listlockList.observe(this) {
      listlockAdapter.updateData(it)
    }
    binding.billPaymentSelectCategoryVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListlock(
    view: View,
    position: Int,
    item: ListlockRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "BILL_PAYMENT_SELECT_CATEGORY_ACTIVITY"

  }
}
