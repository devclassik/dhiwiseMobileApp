package com.opemiposapplication.app.modules.otptransfer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.otptransfer.`data`.model.OtpTransferModel
import org.koin.core.KoinComponent

class OtpTransferVM : ViewModel(), KoinComponent {
  val otpTransferModel: MutableLiveData<OtpTransferModel> = MutableLiveData(OtpTransferModel())

  var navArguments: Bundle? = null
}
