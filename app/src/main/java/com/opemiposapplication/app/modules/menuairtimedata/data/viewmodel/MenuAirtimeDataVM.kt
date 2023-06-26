package com.opemiposapplication.app.modules.menuairtimedata.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.menuairtimedata.`data`.model.MenuAirtimeDataModel
import org.koin.core.KoinComponent

class MenuAirtimeDataVM : ViewModel(), KoinComponent {
  val menuAirtimeDataModel: MutableLiveData<MenuAirtimeDataModel> =
      MutableLiveData(MenuAirtimeDataModel())

  var navArguments: Bundle? = null
}
