package com.opemiposapplication.app.modules.settingsdevices.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.settingsdevices.`data`.model.SettingsDevicesModel
import org.koin.core.KoinComponent

class SettingsDevicesVM : ViewModel(), KoinComponent {
  val settingsDevicesModel: MutableLiveData<SettingsDevicesModel> =
      MutableLiveData(SettingsDevicesModel())

  var navArguments: Bundle? = null
}
