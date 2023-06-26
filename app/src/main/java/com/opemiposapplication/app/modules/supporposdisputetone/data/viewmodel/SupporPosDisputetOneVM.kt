package com.opemiposapplication.app.modules.supporposdisputetone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.supporposdisputetone.`data`.model.SpinnerFrame1656Model
import com.opemiposapplication.app.modules.supporposdisputetone.`data`.model.SupporPosDisputetOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SupporPosDisputetOneVM : ViewModel(), KoinComponent {
  val supporPosDisputetOneModel: MutableLiveData<SupporPosDisputetOneModel> =
      MutableLiveData(SupporPosDisputetOneModel())

  var navArguments: Bundle? = null

  val spinnerFrame1656List: MutableLiveData<MutableList<SpinnerFrame1656Model>> = MutableLiveData()
}
