package com.opemiposapplication.app.modules.supportcallus.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.supportcallus.`data`.model.SupportCallUsModel
import org.koin.core.KoinComponent

class SupportCallUsVM : ViewModel(), KoinComponent {
  val supportCallUsModel: MutableLiveData<SupportCallUsModel> =
      MutableLiveData(SupportCallUsModel())

  var navArguments: Bundle? = null
}
