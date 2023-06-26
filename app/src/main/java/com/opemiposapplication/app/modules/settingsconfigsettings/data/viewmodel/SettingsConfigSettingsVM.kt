package com.opemiposapplication.app.modules.settingsconfigsettings.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.settingsconfigsettings.`data`.model.SettingsConfigSettingsModel
import org.koin.core.KoinComponent

class SettingsConfigSettingsVM : ViewModel(), KoinComponent {
  val settingsConfigSettingsModel: MutableLiveData<SettingsConfigSettingsModel> =
      MutableLiveData(SettingsConfigSettingsModel())

  var navArguments: Bundle? = null
}
