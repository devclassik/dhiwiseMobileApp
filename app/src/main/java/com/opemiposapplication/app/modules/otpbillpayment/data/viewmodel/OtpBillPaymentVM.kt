package com.opemiposapplication.app.modules.otpbillpayment.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.otpbillpayment.`data`.model.OtpBillPaymentModel
import org.koin.core.KoinComponent

class OtpBillPaymentVM : ViewModel(), KoinComponent {
  val otpBillPaymentModel: MutableLiveData<OtpBillPaymentModel> =
      MutableLiveData(OtpBillPaymentModel())

  var navArguments: Bundle? = null
}
