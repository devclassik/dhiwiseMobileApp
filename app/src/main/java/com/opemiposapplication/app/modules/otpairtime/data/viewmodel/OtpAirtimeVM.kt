package com.opemiposapplication.app.modules.otpairtime.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.otpairtime.`data`.model.OtpAirtimeModel
import org.koin.core.KoinComponent

class OtpAirtimeVM : ViewModel(), KoinComponent {
  val otpAirtimeModel: MutableLiveData<OtpAirtimeModel> = MutableLiveData(OtpAirtimeModel())

  var navArguments: Bundle? = null
}
