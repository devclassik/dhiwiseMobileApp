package com.opemiposapplication.app.modules.onboardthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityOnboardThreeBinding
import com.opemiposapplication.app.modules.onboardthree.`data`.viewmodel.OnboardThreeVM
import com.opemiposapplication.app.modules.signupone.ui.SignUpOneActivity
import com.opemiposapplication.app.modules.signuptwo.ui.SignUpTwoActivity
import com.opemiposapplication.app.modules.splashscreenone.ui.SplashScreenOneActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class OnboardThreeActivity :
    BaseActivity<ActivityOnboardThreeBinding>(R.layout.activity_onboard_three) {
  private val viewModel: OnboardThreeVM by viewModels<OnboardThreeVM>()

  private val REQUEST_CODE_SPLASH_SCREEN_ONE_ACTIVITY: Int = 548

  private val REQUEST_CODE_SIGN_UP_ONE_ACTIVITY: Int = 285

  private val REQUEST_CODE_SIGN_UP_TWO_ACTIVITY: Int = 521

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.viewRectangleTwentyOne.setOnClickListener {
      val destIntent = SplashScreenOneActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SPLASH_SCREEN_ONE_ACTIVITY)
      this.overridePendingTransition(R.anim.left_to_right ,R.anim.bounce )
    }
    binding.txtSkip.setOnClickListener {
      val destIntent = SignUpOneActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SIGN_UP_ONE_ACTIVITY)
    }
    binding.btnGetStarted.setOnClickListener {
      val destIntent = SignUpTwoActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SIGN_UP_TWO_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "ONBOARD_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnboardThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
