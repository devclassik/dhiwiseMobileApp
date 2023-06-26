package com.opemiposapplication.app.modules.billpaymentsummary.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.billpaymentsummary.`data`.model.BillPaymentSummaryModel
import org.koin.core.KoinComponent

class BillPaymentSummaryVM : ViewModel(), KoinComponent {
  val billPaymentSummaryModel: MutableLiveData<BillPaymentSummaryModel> =
      MutableLiveData(BillPaymentSummaryModel())

  var navArguments: Bundle? = null
}
