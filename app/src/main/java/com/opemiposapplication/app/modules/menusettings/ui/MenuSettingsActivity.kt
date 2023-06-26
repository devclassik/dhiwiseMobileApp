package com.opemiposapplication.app.modules.menusettings.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityMenuSettingsBinding
import com.opemiposapplication.app.modules.menusettings.`data`.viewmodel.MenuSettingsVM
import kotlin.String
import kotlin.Unit

class MenuSettingsActivity :
    BaseActivity<ActivityMenuSettingsBinding>(R.layout.activity_menu_settings) {
  private val viewModel: MenuSettingsVM by viewModels<MenuSettingsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menuSettingsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MENU_SETTINGS_ACTIVITY"

  }
}
