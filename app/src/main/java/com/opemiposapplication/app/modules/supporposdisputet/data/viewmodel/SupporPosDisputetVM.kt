package com.opemiposapplication.app.modules.supporposdisputet.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.supporposdisputet.`data`.model.SpinnerFrame1656Model
import com.opemiposapplication.app.modules.supporposdisputet.`data`.model.SupporPosDisputetModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SupporPosDisputetVM : ViewModel(), KoinComponent {
  val supporPosDisputetModel: MutableLiveData<SupporPosDisputetModel> =
      MutableLiveData(SupporPosDisputetModel())

  var navArguments: Bundle? = null

  val spinnerFrame1656List: MutableLiveData<MutableList<SpinnerFrame1656Model>> = MutableLiveData()
}
