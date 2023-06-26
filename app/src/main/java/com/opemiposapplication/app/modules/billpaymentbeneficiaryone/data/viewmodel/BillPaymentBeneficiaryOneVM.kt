package com.opemiposapplication.app.modules.billpaymentbeneficiaryone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.billpaymentbeneficiaryone.`data`.model.BillPaymentBeneficiaryOneModel
import org.koin.core.KoinComponent

class BillPaymentBeneficiaryOneVM : ViewModel(), KoinComponent {
  val billPaymentBeneficiaryOneModel: MutableLiveData<BillPaymentBeneficiaryOneModel> =
      MutableLiveData(BillPaymentBeneficiaryOneModel())

  var navArguments: Bundle? = null
}
