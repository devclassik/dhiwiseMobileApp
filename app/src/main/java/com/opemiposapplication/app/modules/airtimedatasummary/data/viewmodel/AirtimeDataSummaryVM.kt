package com.opemiposapplication.app.modules.airtimedatasummary.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.airtimedatasummary.`data`.model.AirtimeDataSummaryModel
import org.koin.core.KoinComponent

class AirtimeDataSummaryVM : ViewModel(), KoinComponent {
  val airtimeDataSummaryModel: MutableLiveData<AirtimeDataSummaryModel> =
      MutableLiveData(AirtimeDataSummaryModel())

  var navArguments: Bundle? = null
}
