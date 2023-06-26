package com.opemiposapplication.app.modules.otpbillpaymentone.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityOtpBillPaymentOneBinding
import com.opemiposapplication.app.modules.otpbillpaymentone.`data`.viewmodel.OtpBillPaymentOneVM
import kotlin.String
import kotlin.Unit

class OtpBillPaymentOneActivity :
    BaseActivity<ActivityOtpBillPaymentOneBinding>(R.layout.activity_otp_bill_payment_one) {
  private val viewModel: OtpBillPaymentOneVM by viewModels<OtpBillPaymentOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.otpBillPaymentOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "OTP_BILL_PAYMENT_ONE_ACTIVITY"

  }
}
