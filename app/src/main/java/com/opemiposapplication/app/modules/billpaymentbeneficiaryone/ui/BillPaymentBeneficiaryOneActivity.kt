package com.opemiposapplication.app.modules.billpaymentbeneficiaryone.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityBillPaymentBeneficiaryOneBinding
import com.opemiposapplication.app.modules.billpaymentbeneficiaryone.`data`.viewmodel.BillPaymentBeneficiaryOneVM
import kotlin.String
import kotlin.Unit

class BillPaymentBeneficiaryOneActivity :
    BaseActivity<ActivityBillPaymentBeneficiaryOneBinding>(R.layout.activity_bill_payment_beneficiary_one)
    {
  private val viewModel: BillPaymentBeneficiaryOneVM by viewModels<BillPaymentBeneficiaryOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.billPaymentBeneficiaryOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "BILL_PAYMENT_BENEFICIARY_ONE_ACTIVITY"

  }
}
