package com.opemiposapplication.app.modules.transfer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.transfer.`data`.model.TransferModel
import org.koin.core.KoinComponent

class TransferVM : ViewModel(), KoinComponent {
  val transferModel: MutableLiveData<TransferModel> = MutableLiveData(TransferModel())

  var navArguments: Bundle? = null
}
