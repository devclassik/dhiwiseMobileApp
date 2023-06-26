package com.opemiposapplication.app.modules.onboard.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityOnboardBinding
import com.opemiposapplication.app.modules.onboard.`data`.viewmodel.OnboardVM
import kotlin.String
import kotlin.Unit

class OnboardActivity : BaseActivity<ActivityOnboardBinding>(R.layout.activity_onboard) {
  private val viewModel: OnboardVM by viewModels<OnboardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ONBOARD_ACTIVITY"

  }
}
