package com.opemiposapplication.app.modules.settingsdevices.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivitySettingsDevicesBinding
import com.opemiposapplication.app.modules.settingsdevices.`data`.viewmodel.SettingsDevicesVM
import kotlin.String
import kotlin.Unit

class SettingsDevicesActivity :
    BaseActivity<ActivitySettingsDevicesBinding>(R.layout.activity_settings_devices) {
  private val viewModel: SettingsDevicesVM by viewModels<SettingsDevicesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.settingsDevicesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SETTINGS_DEVICES_ACTIVITY"

  }
}
