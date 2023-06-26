package com.opemiposapplication.app.modules.airtimedatabeneficiary.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.airtimedatabeneficiary.`data`.model.AirtimeDataBeneficiaryModel
import org.koin.core.KoinComponent

class AirtimeDataBeneficiaryVM : ViewModel(), KoinComponent {
  val airtimeDataBeneficiaryModel: MutableLiveData<AirtimeDataBeneficiaryModel> =
      MutableLiveData(AirtimeDataBeneficiaryModel())

  var navArguments: Bundle? = null
}
