package com.opemiposapplication.app.modules.menuphonepay.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.menuphonepay.`data`.model.MenuPhonePayModel
import org.koin.core.KoinComponent

class MenuPhonePayVM : ViewModel(), KoinComponent {
  val menuPhonePayModel: MutableLiveData<MenuPhonePayModel> = MutableLiveData(MenuPhonePayModel())

  var navArguments: Bundle? = null
}
