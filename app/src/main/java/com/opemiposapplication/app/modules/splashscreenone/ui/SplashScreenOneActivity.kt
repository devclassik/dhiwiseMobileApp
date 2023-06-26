package com.opemiposapplication.app.modules.splashscreenone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivitySplashScreenOneBinding
import com.opemiposapplication.app.modules.signuptwo.ui.SignUpTwoActivity
import com.opemiposapplication.app.modules.splashscreenone.`data`.viewmodel.SplashScreenOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SplashScreenOneActivity :
    BaseActivity<ActivitySplashScreenOneBinding>(R.layout.activity_splash_screen_one) {
  private val viewModel: SplashScreenOneVM by viewModels<SplashScreenOneVM>()

  private val REQUEST_CODE_SIGN_UP_TWO_ACTIVITY: Int = 653


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashScreenOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageEllipseEight.setOnClickListener {
      val destIntent = SignUpTwoActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SIGN_UP_TWO_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "SPLASH_SCREEN_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SplashScreenOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
