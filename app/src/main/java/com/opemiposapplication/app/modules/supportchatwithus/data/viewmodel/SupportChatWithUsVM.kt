package com.opemiposapplication.app.modules.supportchatwithus.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.supportchatwithus.`data`.model.SupportChatWithUsModel
import org.koin.core.KoinComponent

class SupportChatWithUsVM : ViewModel(), KoinComponent {
  val supportChatWithUsModel: MutableLiveData<SupportChatWithUsModel> =
      MutableLiveData(SupportChatWithUsModel())

  var navArguments: Bundle? = null
}
