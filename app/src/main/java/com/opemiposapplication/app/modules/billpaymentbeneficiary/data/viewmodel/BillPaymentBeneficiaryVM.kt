package com.opemiposapplication.app.modules.billpaymentbeneficiary.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.billpaymentbeneficiary.`data`.model.BillPaymentBeneficiaryModel
import org.koin.core.KoinComponent

class BillPaymentBeneficiaryVM : ViewModel(), KoinComponent {
  val billPaymentBeneficiaryModel: MutableLiveData<BillPaymentBeneficiaryModel> =
      MutableLiveData(BillPaymentBeneficiaryModel())

  var navArguments: Bundle? = null
}
