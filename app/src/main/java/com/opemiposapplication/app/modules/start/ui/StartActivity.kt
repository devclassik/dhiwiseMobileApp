package com.opemiposapplication.app.modules.start.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityStartBinding
import com.opemiposapplication.app.modules.start.`data`.viewmodel.StartVM
import kotlin.String
import kotlin.Unit

class StartActivity : BaseActivity<ActivityStartBinding>(R.layout.activity_start) {
  private val viewModel: StartVM by viewModels<StartVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.startVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "START_ACTIVITY"

  }
}
