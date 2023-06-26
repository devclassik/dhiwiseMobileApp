package com.opemiposapplication.app.modules.otpsuccessful.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityOtpSuccessfulBinding
import com.opemiposapplication.app.modules.otp.ui.OtpActivity
import com.opemiposapplication.app.modules.otpsuccessful.`data`.viewmodel.OtpSuccessfulVM
import com.opemiposapplication.app.modules.signup.ui.SignUpActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class OtpSuccessfulActivity :
    BaseActivity<ActivityOtpSuccessfulBinding>(R.layout.activity_otp_successful) {
  private val viewModel: OtpSuccessfulVM by viewModels<OtpSuccessfulVM>()

  private val REQUEST_CODE_OTP_ACTIVITY: Int = 820

  private val REQUEST_CODE_SIGN_UP_ACTIVITY: Int = 453

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.otpSuccessfulVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtBack.setOnClickListener {
      val destIntent = OtpActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_OTP_ACTIVITY)
    }
    binding.btnContinue.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SIGN_UP_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "OTP_SUCCESSFUL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OtpSuccessfulActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
