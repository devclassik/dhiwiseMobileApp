package com.opemiposapplication.app.modules.pinlogin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.pinlogin.`data`.model.PinLoginModel
import com.opemiposapplication.app.modules.pinlogin.`data`.model.PinLoginRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PinLoginVM : ViewModel(), KoinComponent {
  val pinLoginModel: MutableLiveData<PinLoginModel> = MutableLiveData(PinLoginModel())

  var navArguments: Bundle? = null

  val pinLoginList: MutableLiveData<MutableList<PinLoginRowModel>> =
      MutableLiveData(mutableListOf())
}
