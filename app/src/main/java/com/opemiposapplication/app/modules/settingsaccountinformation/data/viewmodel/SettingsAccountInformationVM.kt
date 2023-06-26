package com.opemiposapplication.app.modules.settingsaccountinformation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.settingsaccountinformation.`data`.model.SettingsAccountInformationModel
import com.opemiposapplication.app.modules.settingsaccountinformation.`data`.model.SpinnerGroup1692Model
import com.opemiposapplication.app.modules.settingsaccountinformation.`data`.model.SpinnerGroup308Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SettingsAccountInformationVM : ViewModel(), KoinComponent {
  val settingsAccountInformationModel: MutableLiveData<SettingsAccountInformationModel> =
      MutableLiveData(SettingsAccountInformationModel())

  var navArguments: Bundle? = null

  val spinnerGroup1692List: MutableLiveData<MutableList<SpinnerGroup1692Model>> = MutableLiveData()

  val spinnerGroup308List: MutableLiveData<MutableList<SpinnerGroup308Model>> = MutableLiveData()
}
