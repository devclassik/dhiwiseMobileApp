package com.opemiposapplication.app.modules.menuposterminal.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityMenuPosTerminalBinding
import com.opemiposapplication.app.modules.menuposterminal.`data`.viewmodel.MenuPosTerminalVM
import kotlin.String
import kotlin.Unit

class MenuPosTerminalActivity :
    BaseActivity<ActivityMenuPosTerminalBinding>(R.layout.activity_menu_pos_terminal) {
  private val viewModel: MenuPosTerminalVM by viewModels<MenuPosTerminalVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menuPosTerminalVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MENU_POS_TERMINAL_ACTIVITY"

  }
}
