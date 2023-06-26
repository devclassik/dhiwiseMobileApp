package com.opemiposapplication.app.modules.otpbillpayment.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityOtpBillPaymentBinding
import com.opemiposapplication.app.modules.otpbillpayment.`data`.viewmodel.OtpBillPaymentVM
import kotlin.String
import kotlin.Unit

class OtpBillPaymentActivity :
    BaseActivity<ActivityOtpBillPaymentBinding>(R.layout.activity_otp_bill_payment) {
  private val viewModel: OtpBillPaymentVM by viewModels<OtpBillPaymentVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.otpBillPaymentVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "OTP_BILL_PAYMENT_ACTIVITY"

  }
}
