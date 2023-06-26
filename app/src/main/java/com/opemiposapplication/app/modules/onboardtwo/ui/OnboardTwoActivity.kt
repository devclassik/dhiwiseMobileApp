package com.opemiposapplication.app.modules.onboardtwo.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityOnboardTwoBinding
import com.opemiposapplication.app.modules.onboardtwo.`data`.viewmodel.OnboardTwoVM
import kotlin.String
import kotlin.Unit

class OnboardTwoActivity : BaseActivity<ActivityOnboardTwoBinding>(R.layout.activity_onboard_two) {
  private val viewModel: OnboardTwoVM by viewModels<OnboardTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ONBOARD_TWO_ACTIVITY"

  }
}
