package com.opemiposapplication.app.modules.transferone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.transferone.`data`.model.SpinnerGroup1669OneModel
import com.opemiposapplication.app.modules.transferone.`data`.model.TransferOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TransferOneVM : ViewModel(), KoinComponent {
  val transferOneModel: MutableLiveData<TransferOneModel> = MutableLiveData(TransferOneModel())

  var navArguments: Bundle? = null

  val spinnerGroup1669OneList: MutableLiveData<MutableList<SpinnerGroup1669OneModel>> =
      MutableLiveData()
}
