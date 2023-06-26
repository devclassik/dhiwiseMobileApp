package com.opemiposapplication.app.modules.airtimedataamount.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.airtimedataamount.`data`.model.AirtimeDataAmountModel
import com.opemiposapplication.app.modules.airtimedataamount.`data`.model.SpinnerFilesizeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AirtimeDataAmountVM : ViewModel(), KoinComponent {
  val airtimeDataAmountModel: MutableLiveData<AirtimeDataAmountModel> =
      MutableLiveData(AirtimeDataAmountModel())

  var navArguments: Bundle? = null

  val spinnerFilesizeList: MutableLiveData<MutableList<SpinnerFilesizeModel>> = MutableLiveData()
}
