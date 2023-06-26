package com.opemiposapplication.app.modules.posterminaldetails.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityPosTerminalDetailsBinding
import com.opemiposapplication.app.modules.posterminaldetails.`data`.viewmodel.PosTerminalDetailsVM
import kotlin.String
import kotlin.Unit

class PosTerminalDetailsActivity :
    BaseActivity<ActivityPosTerminalDetailsBinding>(R.layout.activity_pos_terminal_details) {
  private val viewModel: PosTerminalDetailsVM by viewModels<PosTerminalDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.posTerminalDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "POS_TERMINAL_DETAILS_ACTIVITY"

  }
}
