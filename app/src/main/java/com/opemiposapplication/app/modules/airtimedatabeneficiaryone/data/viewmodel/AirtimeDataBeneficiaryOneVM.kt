package com.opemiposapplication.app.modules.airtimedatabeneficiaryone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.airtimedatabeneficiaryone.`data`.model.AirtimeDataBeneficiaryOneModel
import org.koin.core.KoinComponent

class AirtimeDataBeneficiaryOneVM : ViewModel(), KoinComponent {
  val airtimeDataBeneficiaryOneModel: MutableLiveData<AirtimeDataBeneficiaryOneModel> =
      MutableLiveData(AirtimeDataBeneficiaryOneModel())

  var navArguments: Bundle? = null
}
