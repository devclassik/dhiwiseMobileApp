package com.opemiposapplication.app.modules.menuposterminal.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.menuposterminal.`data`.model.MenuPosTerminalModel
import org.koin.core.KoinComponent

class MenuPosTerminalVM : ViewModel(), KoinComponent {
  val menuPosTerminalModel: MutableLiveData<MenuPosTerminalModel> =
      MutableLiveData(MenuPosTerminalModel())

  var navArguments: Bundle? = null
}
