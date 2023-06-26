package com.opemiposapplication.app.modules.billpaymentbeneficiary.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityBillPaymentBeneficiaryBinding
import com.opemiposapplication.app.modules.billpaymentbeneficiary.`data`.viewmodel.BillPaymentBeneficiaryVM
import kotlin.String
import kotlin.Unit

class BillPaymentBeneficiaryActivity :
    BaseActivity<ActivityBillPaymentBeneficiaryBinding>(R.layout.activity_bill_payment_beneficiary)
    {
  private val viewModel: BillPaymentBeneficiaryVM by viewModels<BillPaymentBeneficiaryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.billPaymentBeneficiaryVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "BILL_PAYMENT_BENEFICIARY_ACTIVITY"

  }
}
