package com.opemiposapplication.app.modules.otpsuccessful.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.otpsuccessful.`data`.model.OtpSuccessfulModel
import org.koin.core.KoinComponent

class OtpSuccessfulVM : ViewModel(), KoinComponent {
  val otpSuccessfulModel: MutableLiveData<OtpSuccessfulModel> =
      MutableLiveData(OtpSuccessfulModel())

  var navArguments: Bundle? = null
}
