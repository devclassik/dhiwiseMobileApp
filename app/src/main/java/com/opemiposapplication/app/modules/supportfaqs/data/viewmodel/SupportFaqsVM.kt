package com.opemiposapplication.app.modules.supportfaqs.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.supportfaqs.`data`.model.SupportFaqsModel
import org.koin.core.KoinComponent

class SupportFaqsVM : ViewModel(), KoinComponent {
  val supportFaqsModel: MutableLiveData<SupportFaqsModel> = MutableLiveData(SupportFaqsModel())

  var navArguments: Bundle? = null
}
