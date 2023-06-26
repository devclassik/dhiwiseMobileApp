package com.opemiposapplication.app.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivitySignUpBinding
import com.opemiposapplication.app.modules.enterbvn.ui.EnterBvnActivity
import com.opemiposapplication.app.modules.otpsuccessful.ui.OtpSuccessfulActivity
import com.opemiposapplication.app.modules.signup.`data`.viewmodel.SignUpVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SignUpActivity : BaseActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {
  private val viewModel: SignUpVM by viewModels<SignUpVM>()

  private val REQUEST_CODE_OTP_SUCCESSFUL_ACTIVITY: Int = 344


  private val REQUEST_CODE_ENTER_BVN_ACTIVITY: Int = 393


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtBack.setOnClickListener {
      val destIntent = OtpSuccessfulActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_OTP_SUCCESSFUL_ACTIVITY)
    }
    binding.btnNext.setOnClickListener {
      val destIntent = EnterBvnActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ENTER_BVN_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "SIGN_UP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
