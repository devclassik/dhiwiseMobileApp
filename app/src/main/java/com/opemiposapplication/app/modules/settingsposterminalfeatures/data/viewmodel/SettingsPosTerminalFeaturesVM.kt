package com.opemiposapplication.app.modules.settingsposterminalfeatures.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.settingsposterminalfeatures.`data`.model.ListardownRowModel
import com.opemiposapplication.app.modules.settingsposterminalfeatures.`data`.model.SettingsPosTerminalFeaturesModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SettingsPosTerminalFeaturesVM : ViewModel(), KoinComponent {
  val settingsPosTerminalFeaturesModel: MutableLiveData<SettingsPosTerminalFeaturesModel> =
      MutableLiveData(SettingsPosTerminalFeaturesModel())

  var navArguments: Bundle? = null

  val listarrowdownList: MutableLiveData<MutableList<ListardownRowModel>> =
      MutableLiveData(mutableListOf())
}
