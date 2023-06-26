package com.opemiposapplication.app.modules.airtimedatasummaryone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.airtimedatasummaryone.`data`.model.AirtimeDataSummaryOneModel
import org.koin.core.KoinComponent

class AirtimeDataSummaryOneVM : ViewModel(), KoinComponent {
  val airtimeDataSummaryOneModel: MutableLiveData<AirtimeDataSummaryOneModel> =
      MutableLiveData(AirtimeDataSummaryOneModel())

  var navArguments: Bundle? = null
}
