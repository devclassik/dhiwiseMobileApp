package com.opemiposapplication.app.modules.posterminal.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityPosTerminalBinding
import com.opemiposapplication.app.modules.posterminal.`data`.viewmodel.PosTerminalVM
import kotlin.String
import kotlin.Unit

class PosTerminalActivity : BaseActivity<ActivityPosTerminalBinding>(R.layout.activity_pos_terminal)
    {
  private val viewModel: PosTerminalVM by viewModels<PosTerminalVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.posTerminalVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "POS_TERMINAL_ACTIVITY"

  }
}
