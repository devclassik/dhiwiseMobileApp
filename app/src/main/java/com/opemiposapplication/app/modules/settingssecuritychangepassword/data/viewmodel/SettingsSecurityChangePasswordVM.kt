package com.opemiposapplication.app.modules.settingssecuritychangepassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.settingssecuritychangepassword.`data`.model.SettingsSecurityChangePasswordModel
import org.koin.core.KoinComponent

class SettingsSecurityChangePasswordVM : ViewModel(), KoinComponent {
  val settingsSecurityChangePasswordModel: MutableLiveData<SettingsSecurityChangePasswordModel> =
      MutableLiveData(SettingsSecurityChangePasswordModel())

  var navArguments: Bundle? = null
}
