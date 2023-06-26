package com.opemiposapplication.app.modules.onboardone.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityOnboardOneBinding
import com.opemiposapplication.app.modules.onboardone.`data`.viewmodel.OnboardOneVM
import kotlin.String
import kotlin.Unit

class OnboardOneActivity : BaseActivity<ActivityOnboardOneBinding>(R.layout.activity_onboard_one) {
  private val viewModel: OnboardOneVM by viewModels<OnboardOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ONBOARD_ONE_ACTIVITY"

  }
}
