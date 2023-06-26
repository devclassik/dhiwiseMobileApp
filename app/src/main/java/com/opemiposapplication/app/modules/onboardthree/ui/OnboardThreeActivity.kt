package com.opemiposapplication.app.modules.onboardthree.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityOnboardThreeBinding
import com.opemiposapplication.app.modules.onboardthree.`data`.viewmodel.OnboardThreeVM
import kotlin.String
import kotlin.Unit

class OnboardThreeActivity :
    BaseActivity<ActivityOnboardThreeBinding>(R.layout.activity_onboard_three) {
  private val viewModel: OnboardThreeVM by viewModels<OnboardThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ONBOARD_THREE_ACTIVITY"

  }
}
