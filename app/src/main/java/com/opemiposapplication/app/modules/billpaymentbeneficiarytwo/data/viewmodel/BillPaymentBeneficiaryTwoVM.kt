package com.opemiposapplication.app.modules.billpaymentbeneficiarytwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.billpaymentbeneficiarytwo.`data`.model.BillPaymentBeneficiaryTwoModel
import org.koin.core.KoinComponent

class BillPaymentBeneficiaryTwoVM : ViewModel(), KoinComponent {
  val billPaymentBeneficiaryTwoModel: MutableLiveData<BillPaymentBeneficiaryTwoModel> =
      MutableLiveData(BillPaymentBeneficiaryTwoModel())

  var navArguments: Bundle? = null
}
