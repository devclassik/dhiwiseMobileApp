package com.opemiposapplication.app.modules.billpaymentbeneficiarytwo.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityBillPaymentBeneficiaryTwoBinding
import com.opemiposapplication.app.modules.billpaymentbeneficiarytwo.`data`.viewmodel.BillPaymentBeneficiaryTwoVM
import kotlin.String
import kotlin.Unit

class BillPaymentBeneficiaryTwoActivity :
    BaseActivity<ActivityBillPaymentBeneficiaryTwoBinding>(R.layout.activity_bill_payment_beneficiary_two)
    {
  private val viewModel: BillPaymentBeneficiaryTwoVM by viewModels<BillPaymentBeneficiaryTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.billPaymentBeneficiaryTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "BILL_PAYMENT_BENEFICIARY_TWO_ACTIVITY"

  }
}
