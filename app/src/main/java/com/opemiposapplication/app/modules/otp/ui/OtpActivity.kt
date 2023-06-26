package com.opemiposapplication.app.modules.otp.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityOtpBinding
import com.opemiposapplication.app.modules.otp.`data`.viewmodel.OtpVM
import com.opemiposapplication.app.modules.otpsuccessful.ui.OtpSuccessfulActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class OtpActivity : BaseActivity<ActivityOtpBinding>(R.layout.activity_otp) {
  private val viewModel: OtpVM by viewModels<OtpVM>()

  private val REQUEST_CODE_OTP_SUCCESSFUL_ACTIVITY: Int = 649


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.otpVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnVerify.setOnClickListener {
      val destIntent = OtpSuccessfulActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_OTP_SUCCESSFUL_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "OTP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OtpActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
