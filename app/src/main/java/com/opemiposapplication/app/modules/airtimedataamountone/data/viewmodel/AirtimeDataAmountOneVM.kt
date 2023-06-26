package com.opemiposapplication.app.modules.airtimedataamountone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.airtimedataamountone.`data`.model.AirtimeDataAmountOneModel
import org.koin.core.KoinComponent

class AirtimeDataAmountOneVM : ViewModel(), KoinComponent {
  val airtimeDataAmountOneModel: MutableLiveData<AirtimeDataAmountOneModel> =
      MutableLiveData(AirtimeDataAmountOneModel())

  var navArguments: Bundle? = null
}
