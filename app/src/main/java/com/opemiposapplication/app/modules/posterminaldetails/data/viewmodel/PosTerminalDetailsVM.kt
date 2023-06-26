package com.opemiposapplication.app.modules.posterminaldetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.posterminaldetails.`data`.model.PosTerminalDetailsModel
import org.koin.core.KoinComponent

class PosTerminalDetailsVM : ViewModel(), KoinComponent {
  val posTerminalDetailsModel: MutableLiveData<PosTerminalDetailsModel> =
      MutableLiveData(PosTerminalDetailsModel())

  var navArguments: Bundle? = null
}
