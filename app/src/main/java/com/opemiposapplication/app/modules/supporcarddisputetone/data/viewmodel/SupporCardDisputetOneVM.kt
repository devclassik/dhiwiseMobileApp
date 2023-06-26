package com.opemiposapplication.app.modules.supporcarddisputetone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.supporcarddisputetone.`data`.model.SpinnerFrame1656Model
import com.opemiposapplication.app.modules.supporcarddisputetone.`data`.model.SupporCardDisputetOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SupporCardDisputetOneVM : ViewModel(), KoinComponent {
  val supporCardDisputetOneModel: MutableLiveData<SupporCardDisputetOneModel> =
      MutableLiveData(SupporCardDisputetOneModel())

  var navArguments: Bundle? = null

  val spinnerFrame1656List: MutableLiveData<MutableList<SpinnerFrame1656Model>> = MutableLiveData()
}
