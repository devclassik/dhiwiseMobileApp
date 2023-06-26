package com.opemiposapplication.app.modules.supporposdisputetthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.supporposdisputetthree.`data`.model.SpinnerFrame1656Model
import com.opemiposapplication.app.modules.supporposdisputetthree.`data`.model.SupporPosDisputetThreeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SupporPosDisputetThreeVM : ViewModel(), KoinComponent {
  val supporPosDisputetThreeModel: MutableLiveData<SupporPosDisputetThreeModel> =
      MutableLiveData(SupporPosDisputetThreeModel())

  var navArguments: Bundle? = null

  val spinnerFrame1656List: MutableLiveData<MutableList<SpinnerFrame1656Model>> = MutableLiveData()
}
