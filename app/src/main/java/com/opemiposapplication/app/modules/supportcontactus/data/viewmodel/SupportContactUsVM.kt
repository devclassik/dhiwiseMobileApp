package com.opemiposapplication.app.modules.supportcontactus.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.supportcontactus.`data`.model.SupportContactUsModel
import org.koin.core.KoinComponent

class SupportContactUsVM : ViewModel(), KoinComponent {
  val supportContactUsModel: MutableLiveData<SupportContactUsModel> =
      MutableLiveData(SupportContactUsModel())

  var navArguments: Bundle? = null
}
