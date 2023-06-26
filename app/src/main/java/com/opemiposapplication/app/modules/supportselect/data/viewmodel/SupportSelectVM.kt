package com.opemiposapplication.app.modules.supportselect.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.supportselect.`data`.model.SupportSelectModel
import org.koin.core.KoinComponent

class SupportSelectVM : ViewModel(), KoinComponent {
  val supportSelectModel: MutableLiveData<SupportSelectModel> =
      MutableLiveData(SupportSelectModel())

  var navArguments: Bundle? = null
}
