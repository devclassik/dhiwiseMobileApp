package com.opemiposapplication.app.modules.menutransfers.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.menutransfers.`data`.model.MenuTransfersModel
import org.koin.core.KoinComponent

class MenuTransfersVM : ViewModel(), KoinComponent {
  val menuTransfersModel: MutableLiveData<MenuTransfersModel> =
      MutableLiveData(MenuTransfersModel())

  var navArguments: Bundle? = null
}
