package com.opemiposapplication.app.modules.billpaymentutilities.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityBillPaymentUtilitiesBinding
import com.opemiposapplication.app.modules.billpaymentutilities.`data`.model.SpinnerPriceModel
import com.opemiposapplication.app.modules.billpaymentutilities.`data`.viewmodel.BillPaymentUtilitiesVM
import kotlin.String
import kotlin.Unit

class BillPaymentUtilitiesActivity :
    BaseActivity<ActivityBillPaymentUtilitiesBinding>(R.layout.activity_bill_payment_utilities) {
  private val viewModel: BillPaymentUtilitiesVM by viewModels<BillPaymentUtilitiesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerPriceList.value = mutableListOf(
    SpinnerPriceModel("Item1"),
    SpinnerPriceModel("Item2"),
    SpinnerPriceModel("Item3"),
    SpinnerPriceModel("Item4"),
    SpinnerPriceModel("Item5")
    )
    val spinnerPriceAdapter =
    SpinnerPriceAdapter(this,R.layout.spinner_item,viewModel.spinnerPriceList.value?:
    mutableListOf())
    binding.spinnerPrice.adapter = spinnerPriceAdapter
    binding.billPaymentUtilitiesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "BILL_PAYMENT_UTILITIES_ACTIVITY"

  }
}
