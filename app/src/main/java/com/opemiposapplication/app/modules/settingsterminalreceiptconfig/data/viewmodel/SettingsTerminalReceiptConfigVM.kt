package com.opemiposapplication.app.modules.settingsterminalreceiptconfig.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.settingsterminalreceiptconfig.`data`.model.SettingsTerminalReceiptConfigModel
import org.koin.core.KoinComponent

class SettingsTerminalReceiptConfigVM : ViewModel(), KoinComponent {
  val settingsTerminalReceiptConfigModel: MutableLiveData<SettingsTerminalReceiptConfigModel> =
      MutableLiveData(SettingsTerminalReceiptConfigModel())

  var navArguments: Bundle? = null
}
