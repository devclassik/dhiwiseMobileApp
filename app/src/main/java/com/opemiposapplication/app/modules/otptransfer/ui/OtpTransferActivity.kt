package com.opemiposapplication.app.modules.otptransfer.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityOtpTransferBinding
import com.opemiposapplication.app.modules.otptransfer.`data`.viewmodel.OtpTransferVM
import kotlin.String
import kotlin.Unit

class OtpTransferActivity : BaseActivity<ActivityOtpTransferBinding>(R.layout.activity_otp_transfer)
    {
  private val viewModel: OtpTransferVM by viewModels<OtpTransferVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.otpTransferVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "OTP_TRANSFER_ACTIVITY"

  }
}
