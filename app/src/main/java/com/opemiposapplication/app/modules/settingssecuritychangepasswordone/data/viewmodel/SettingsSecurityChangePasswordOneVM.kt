package com.opemiposapplication.app.modules.settingssecuritychangepasswordone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.settingssecuritychangepasswordone.`data`.model.ListoneRowModel
import com.opemiposapplication.app.modules.settingssecuritychangepasswordone.`data`.model.SettingsSecurityChangePasswordOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SettingsSecurityChangePasswordOneVM : ViewModel(), KoinComponent {
  val settingsSecurityChangePasswordOneModel:
      MutableLiveData<SettingsSecurityChangePasswordOneModel> =
      MutableLiveData(SettingsSecurityChangePasswordOneModel())

  var navArguments: Bundle? = null

  val listoneList: MutableLiveData<MutableList<ListoneRowModel>> = MutableLiveData(mutableListOf())
}
