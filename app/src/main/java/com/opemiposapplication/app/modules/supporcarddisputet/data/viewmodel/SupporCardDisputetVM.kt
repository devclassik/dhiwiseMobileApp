package com.opemiposapplication.app.modules.supporcarddisputet.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.supporcarddisputet.`data`.model.SpinnerFrame1656Model
import com.opemiposapplication.app.modules.supporcarddisputet.`data`.model.SupporCardDisputetModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SupporCardDisputetVM : ViewModel(), KoinComponent {
  val supporCardDisputetModel: MutableLiveData<SupporCardDisputetModel> =
      MutableLiveData(SupporCardDisputetModel())

  var navArguments: Bundle? = null

  val spinnerFrame1656List: MutableLiveData<MutableList<SpinnerFrame1656Model>> = MutableLiveData()
}
