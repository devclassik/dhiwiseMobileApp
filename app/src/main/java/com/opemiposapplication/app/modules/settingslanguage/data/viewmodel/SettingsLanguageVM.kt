package com.opemiposapplication.app.modules.settingslanguage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.settingslanguage.`data`.model.SettingsLanguageModel
import com.opemiposapplication.app.modules.settingslanguage.`data`.model.SpinnerLanguageModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SettingsLanguageVM : ViewModel(), KoinComponent {
  val settingsLanguageModel: MutableLiveData<SettingsLanguageModel> =
      MutableLiveData(SettingsLanguageModel())

  var navArguments: Bundle? = null

  val spinnerLanguageList: MutableLiveData<MutableList<SpinnerLanguageModel>> = MutableLiveData()
}
