package com.opemiposapplication.app.modules.billpaymentcabletv.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityBillPaymentCableTvBinding
import com.opemiposapplication.app.modules.billpaymentcabletv.`data`.model.SpinnerGroup1669Model
import com.opemiposapplication.app.modules.billpaymentcabletv.`data`.model.SpinnerGroup1669OneModel
import com.opemiposapplication.app.modules.billpaymentcabletv.`data`.viewmodel.BillPaymentCableTvVM
import kotlin.String
import kotlin.Unit

class BillPaymentCableTvActivity :
    BaseActivity<ActivityBillPaymentCableTvBinding>(R.layout.activity_bill_payment_cable_tv) {
  private val viewModel: BillPaymentCableTvVM by viewModels<BillPaymentCableTvVM>()

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
    viewModel.spinnerGroup1669OneList.value = mutableListOf(
    SpinnerGroup1669OneModel("Item1"),
    SpinnerGroup1669OneModel("Item2"),
    SpinnerGroup1669OneModel("Item3"),
    SpinnerGroup1669OneModel("Item4"),
    SpinnerGroup1669OneModel("Item5")
    )
    val spinnerGroup1669OneAdapter =
    SpinnerGroup1669OneAdapter(this,R.layout.spinner_item,viewModel.spinnerGroup1669OneList.value?:
    mutableListOf())
    binding.spinnerGroup1669One.adapter = spinnerGroup1669OneAdapter
    binding.billPaymentCableTvVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "BILL_PAYMENT_CABLE_TV_ACTIVITY"

  }
}
