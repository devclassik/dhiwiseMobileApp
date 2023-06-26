package com.opemiposapplication.app.modules.airtimedataselect.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.airtimedataselect.`data`.model.AirtimeDataSelectModel
import com.opemiposapplication.app.modules.airtimedataselect.`data`.model.ListcallRowModel
import com.opemiposapplication.app.modules.airtimedataselect.`data`.model.SpinnerGroup1669Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AirtimeDataSelectVM : ViewModel(), KoinComponent {
  val airtimeDataSelectModel: MutableLiveData<AirtimeDataSelectModel> =
      MutableLiveData(AirtimeDataSelectModel())

  var navArguments: Bundle? = null

  val spinnerGroup1669List: MutableLiveData<MutableList<SpinnerGroup1669Model>> = MutableLiveData()

  val listcallList: MutableLiveData<MutableList<ListcallRowModel>> =
      MutableLiveData(mutableListOf())
}
