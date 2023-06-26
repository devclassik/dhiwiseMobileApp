package com.opemiposapplication.app.modules.billpaymentsummaryone.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityBillPaymentSummaryOneBinding
import com.opemiposapplication.app.modules.billpaymentsummaryone.`data`.viewmodel.BillPaymentSummaryOneVM
import kotlin.String
import kotlin.Unit

class BillPaymentSummaryOneActivity :
    BaseActivity<ActivityBillPaymentSummaryOneBinding>(R.layout.activity_bill_payment_summary_one) {
  private val viewModel: BillPaymentSummaryOneVM by viewModels<BillPaymentSummaryOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.billPaymentSummaryOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "BILL_PAYMENT_SUMMARY_ONE_ACTIVITY"

  }
}
