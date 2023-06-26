package com.opemiposapplication.app.modules.posterminal.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.posterminal.`data`.model.PosTerminalModel
import org.koin.core.KoinComponent

class PosTerminalVM : ViewModel(), KoinComponent {
  val posTerminalModel: MutableLiveData<PosTerminalModel> = MutableLiveData(PosTerminalModel())

  var navArguments: Bundle? = null
}
