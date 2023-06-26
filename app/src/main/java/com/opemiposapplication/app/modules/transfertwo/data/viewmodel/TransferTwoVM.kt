package com.opemiposapplication.app.modules.transfertwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.transfertwo.`data`.model.TransferTwoModel
import org.koin.core.KoinComponent

class TransferTwoVM : ViewModel(), KoinComponent {
  val transferTwoModel: MutableLiveData<TransferTwoModel> = MutableLiveData(TransferTwoModel())

  var navArguments: Bundle? = null
}
