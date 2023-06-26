package com.opemiposapplication.app.modules.otpsuccessful.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityOtpSuccessfulBinding
import com.opemiposapplication.app.modules.otpsuccessful.`data`.viewmodel.OtpSuccessfulVM
import kotlin.String
import kotlin.Unit

class OtpSuccessfulActivity :
    BaseActivity<ActivityOtpSuccessfulBinding>(R.layout.activity_otp_successful) {
  private val viewModel: OtpSuccessfulVM by viewModels<OtpSuccessfulVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.otpSuccessfulVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "OTP_SUCCESSFUL_ACTIVITY"

  }
}
