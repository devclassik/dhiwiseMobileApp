package com.opemiposapplication.app.modules.welcomeback.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityWelcomeBackBinding
import com.opemiposapplication.app.modules.welcomeback.`data`.viewmodel.WelcomeBackVM
import kotlin.String
import kotlin.Unit

class WelcomeBackActivity : BaseActivity<ActivityWelcomeBackBinding>(R.layout.activity_welcome_back)
    {
  private val viewModel: WelcomeBackVM by viewModels<WelcomeBackVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.welcomeBackVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "WELCOME_BACK_ACTIVITY"

  }
}
