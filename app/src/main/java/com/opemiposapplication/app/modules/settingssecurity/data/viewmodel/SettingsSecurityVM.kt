package com.opemiposapplication.app.modules.settingssecurity.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.settingssecurity.`data`.model.SettingsSecurityModel
import org.koin.core.KoinComponent

class SettingsSecurityVM : ViewModel(), KoinComponent {
  val settingsSecurityModel: MutableLiveData<SettingsSecurityModel> =
      MutableLiveData(SettingsSecurityModel())

  var navArguments: Bundle? = null
}
