package com.opemiposapplication.app.modules.settingspersonalinformation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.settingspersonalinformation.`data`.model.SettingsPersonalInformationModel
import com.opemiposapplication.app.modules.settingspersonalinformation.`data`.model.SpinnerGroup1692Model
import com.opemiposapplication.app.modules.settingspersonalinformation.`data`.model.SpinnerGroup1693Model
import com.opemiposapplication.app.modules.settingspersonalinformation.`data`.model.SpinnerGroup308Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SettingsPersonalInformationVM : ViewModel(), KoinComponent {
  val settingsPersonalInformationModel: MutableLiveData<SettingsPersonalInformationModel> =
      MutableLiveData(SettingsPersonalInformationModel())

  var navArguments: Bundle? = null

  val spinnerGroup1692List: MutableLiveData<MutableList<SpinnerGroup1692Model>> = MutableLiveData()

  val spinnerGroup308List: MutableLiveData<MutableList<SpinnerGroup308Model>> = MutableLiveData()

  val spinnerGroup1693List: MutableLiveData<MutableList<SpinnerGroup1693Model>> = MutableLiveData()
}
