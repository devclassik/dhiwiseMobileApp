package com.opemiposapplication.app.modules.otplogin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.otplogin.`data`.model.OtpLoginModel
import org.koin.core.KoinComponent

class OtpLoginVM : ViewModel(), KoinComponent {
  val otpLoginModel: MutableLiveData<OtpLoginModel> = MutableLiveData(OtpLoginModel())

  var navArguments: Bundle? = null
}
