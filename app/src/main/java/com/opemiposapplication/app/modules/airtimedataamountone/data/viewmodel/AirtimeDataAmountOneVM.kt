package com.opemiposapplication.app.modules.airtimedataamountone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.airtimedataamountone.`data`.model.AirtimeDataAmountOneModel
import com.opemiposapplication.app.modules.airtimedataamountone.`data`.model.SpinnerFilesizeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AirtimeDataAmountOneVM : ViewModel(), KoinComponent {
  val airtimeDataAmountOneModel: MutableLiveData<AirtimeDataAmountOneModel> =
      MutableLiveData(AirtimeDataAmountOneModel())

  var navArguments: Bundle? = null

  val spinnerFilesizeList: MutableLiveData<MutableList<SpinnerFilesizeModel>> = MutableLiveData()
}
