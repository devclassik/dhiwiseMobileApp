package com.opemiposapplication.app.modules.settingsposconfig.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.settingsposconfig.`data`.model.SettingsPosConfigModel
import org.koin.core.KoinComponent

class SettingsPosConfigVM : ViewModel(), KoinComponent {
  val settingsPosConfigModel: MutableLiveData<SettingsPosConfigModel> =
      MutableLiveData(SettingsPosConfigModel())

  var navArguments: Bundle? = null
}
