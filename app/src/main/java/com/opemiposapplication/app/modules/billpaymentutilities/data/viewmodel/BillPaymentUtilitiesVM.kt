package com.opemiposapplication.app.modules.billpaymentutilities.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.billpaymentutilities.`data`.model.BillPaymentUtilitiesModel
import com.opemiposapplication.app.modules.billpaymentutilities.`data`.model.SpinnerPriceModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class BillPaymentUtilitiesVM : ViewModel(), KoinComponent {
  val billPaymentUtilitiesModel: MutableLiveData<BillPaymentUtilitiesModel> =
      MutableLiveData(BillPaymentUtilitiesModel())

  var navArguments: Bundle? = null

  val spinnerPriceList: MutableLiveData<MutableList<SpinnerPriceModel>> = MutableLiveData()
}
