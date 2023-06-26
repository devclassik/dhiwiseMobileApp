package com.opemiposapplication.app.modules.billpaymentcabletv.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.billpaymentcabletv.`data`.model.BillPaymentCableTvModel
import com.opemiposapplication.app.modules.billpaymentcabletv.`data`.model.SpinnerGroup1669Model
import com.opemiposapplication.app.modules.billpaymentcabletv.`data`.model.SpinnerGroup1669OneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class BillPaymentCableTvVM : ViewModel(), KoinComponent {
  val billPaymentCableTvModel: MutableLiveData<BillPaymentCableTvModel> =
      MutableLiveData(BillPaymentCableTvModel())

  var navArguments: Bundle? = null

  val spinnerGroup1669List: MutableLiveData<MutableList<SpinnerGroup1669Model>> = MutableLiveData()

  val spinnerGroup1669OneList: MutableLiveData<MutableList<SpinnerGroup1669OneModel>> =
      MutableLiveData()
}
