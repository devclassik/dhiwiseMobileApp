package com.opemiposapplication.app.modules.settingspersonalinformation.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.appcomponents.views.DatePickerFragment
import com.opemiposapplication.app.databinding.ActivitySettingsPersonalInformationBinding
import com.opemiposapplication.app.modules.settingspersonalinformation.`data`.model.SpinnerGroup1692Model
import com.opemiposapplication.app.modules.settingspersonalinformation.`data`.model.SpinnerGroup1693Model
import com.opemiposapplication.app.modules.settingspersonalinformation.`data`.model.SpinnerGroup308Model
import com.opemiposapplication.app.modules.settingspersonalinformation.`data`.viewmodel.SettingsPersonalInformationVM
import java.util.Date
import kotlin.String
import kotlin.Unit

class SettingsPersonalInformationActivity :
    BaseActivity<ActivitySettingsPersonalInformationBinding>(R.layout.activity_settings_personal_information)
    {
  private val viewModel: SettingsPersonalInformationVM by
      viewModels<SettingsPersonalInformationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroup1692List.value = mutableListOf(
    SpinnerGroup1692Model("Item1"),
    SpinnerGroup1692Model("Item2"),
    SpinnerGroup1692Model("Item3"),
    SpinnerGroup1692Model("Item4"),
    SpinnerGroup1692Model("Item5")
    )
    val spinnerGroup1692Adapter =
    SpinnerGroup1692Adapter(this,R.layout.spinner_item,viewModel.spinnerGroup1692List.value?:
    mutableListOf())
    binding.spinnerGroup1692.adapter = spinnerGroup1692Adapter
    viewModel.spinnerGroup308List.value = mutableListOf(
    SpinnerGroup308Model("Item1"),
    SpinnerGroup308Model("Item2"),
    SpinnerGroup308Model("Item3"),
    SpinnerGroup308Model("Item4"),
    SpinnerGroup308Model("Item5")
    )
    val spinnerGroup308Adapter =
    SpinnerGroup308Adapter(this,R.layout.spinner_item,viewModel.spinnerGroup308List.value?:
    mutableListOf())
    binding.spinnerGroup308.adapter = spinnerGroup308Adapter
    viewModel.spinnerGroup1693List.value = mutableListOf(
    SpinnerGroup1693Model("Item1"),
    SpinnerGroup1693Model("Item2"),
    SpinnerGroup1693Model("Item3"),
    SpinnerGroup1693Model("Item4"),
    SpinnerGroup1693Model("Item5")
    )
    val spinnerGroup1693Adapter =
    SpinnerGroup1693Adapter(this,R.layout.spinner_item,viewModel.spinnerGroup1693List.value?:
    mutableListOf())
    binding.spinnerGroup1693.adapter = spinnerGroup1693Adapter
    binding.settingsPersonalInformationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearRowdateofbirthOne.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
          selectedDate ->
        onDateSelectedLinearRowdateofbirthOne(selectedDate)
      }
    }
    binding.linearRowdateofbirth.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
          selectedDate ->
        onDateSelectedLinearRowdateofbirth(selectedDate)
      }
    }
  }

  private fun onDateSelectedLinearRowdateofbirthOne(selectedDate: Date) {
  }

  private fun onDateSelectedLinearRowdateofbirth(selectedDate: Date) {
  }

  companion object {
    const val TAG: String = "SETTINGS_PERSONAL_INFORMATION_ACTIVITY"

  }
}
