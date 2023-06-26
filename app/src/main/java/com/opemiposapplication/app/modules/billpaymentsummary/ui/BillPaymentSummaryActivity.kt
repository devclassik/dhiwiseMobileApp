package com.opemiposapplication.app.modules.billpaymentsummary.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityBillPaymentSummaryBinding
import com.opemiposapplication.app.modules.billpaymentsummary.`data`.viewmodel.BillPaymentSummaryVM
import kotlin.String
import kotlin.Unit

class BillPaymentSummaryActivity :
    BaseActivity<ActivityBillPaymentSummaryBinding>(R.layout.activity_bill_payment_summary) {
  private val viewModel: BillPaymentSummaryVM by viewModels<BillPaymentSummaryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.billPaymentSummaryVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "BILL_PAYMENT_SUMMARY_ACTIVITY"

  }
}
