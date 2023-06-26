package com.opemiposapplication.app.modules.supporposdisputettwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.supporposdisputettwo.`data`.model.SpinnerFrame1656Model
import com.opemiposapplication.app.modules.supporposdisputettwo.`data`.model.SupporPosDisputetTwoModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SupporPosDisputetTwoVM : ViewModel(), KoinComponent {
  val supporPosDisputetTwoModel: MutableLiveData<SupporPosDisputetTwoModel> =
      MutableLiveData(SupporPosDisputetTwoModel())

  var navArguments: Bundle? = null

  val spinnerFrame1656List: MutableLiveData<MutableList<SpinnerFrame1656Model>> = MutableLiveData()
}
