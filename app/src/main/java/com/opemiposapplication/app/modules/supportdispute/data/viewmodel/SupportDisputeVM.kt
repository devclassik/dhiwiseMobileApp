package com.opemiposapplication.app.modules.supportdispute.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.supportdispute.`data`.model.SupportDisputeModel
import org.koin.core.KoinComponent

class SupportDisputeVM : ViewModel(), KoinComponent {
  val supportDisputeModel: MutableLiveData<SupportDisputeModel> =
      MutableLiveData(SupportDisputeModel())

  var navArguments: Bundle? = null
}
