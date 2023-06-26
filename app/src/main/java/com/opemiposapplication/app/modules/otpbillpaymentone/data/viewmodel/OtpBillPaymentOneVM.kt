package com.opemiposapplication.app.modules.otpbillpaymentone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.otpbillpaymentone.`data`.model.OtpBillPaymentOneModel
import org.koin.core.KoinComponent

class OtpBillPaymentOneVM : ViewModel(), KoinComponent {
  val otpBillPaymentOneModel: MutableLiveData<OtpBillPaymentOneModel> =
      MutableLiveData(OtpBillPaymentOneModel())

  var navArguments: Bundle? = null
}
