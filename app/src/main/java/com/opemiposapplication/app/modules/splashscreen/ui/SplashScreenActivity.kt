package com.opemiposapplication.app.modules.splashscreen.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivitySplashScreenBinding
import com.opemiposapplication.app.modules.onboardthree.ui.OnboardThreeActivity
import com.opemiposapplication.app.modules.splashscreen.`data`.viewmodel.SplashScreenVM
import kotlin.String
import kotlin.Unit

class SplashScreenActivity :
    BaseActivity<ActivitySplashScreenBinding>(R.layout.activity_splash_screen) {
  private val viewModel: SplashScreenVM by viewModels<SplashScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGetStarted.setOnClickListener {
      val destIntent = OnboardThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SPLASH_SCREEN_ACTIVITY"

  }
}
