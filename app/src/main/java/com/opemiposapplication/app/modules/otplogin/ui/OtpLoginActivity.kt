package com.opemiposapplication.app.modules.otplogin.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityOtpLoginBinding
import com.opemiposapplication.app.modules.otplogin.`data`.viewmodel.OtpLoginVM
import kotlin.String
import kotlin.Unit

class OtpLoginActivity : BaseActivity<ActivityOtpLoginBinding>(R.layout.activity_otp_login) {
  private val viewModel: OtpLoginVM by viewModels<OtpLoginVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.otpLoginVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "OTP_LOGIN_ACTIVITY"

  }
}
