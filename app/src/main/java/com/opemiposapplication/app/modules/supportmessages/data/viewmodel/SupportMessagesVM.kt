package com.opemiposapplication.app.modules.supportmessages.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.supportmessages.`data`.model.SupportMessagesModel
import org.koin.core.KoinComponent

class SupportMessagesVM : ViewModel(), KoinComponent {
  val supportMessagesModel: MutableLiveData<SupportMessagesModel> =
      MutableLiveData(SupportMessagesModel())

  var navArguments: Bundle? = null
}
