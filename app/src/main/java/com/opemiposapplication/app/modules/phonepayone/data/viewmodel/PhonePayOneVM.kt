package com.opemiposapplication.app.modules.phonepayone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.phonepayone.`data`.model.PhonePayOneModel
import com.opemiposapplication.app.modules.phonepayone.`data`.model.SpinnerGroup909Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PhonePayOneVM : ViewModel(), KoinComponent {
  val phonePayOneModel: MutableLiveData<PhonePayOneModel> = MutableLiveData(PhonePayOneModel())

  var navArguments: Bundle? = null

  val spinnerGroup909List: MutableLiveData<MutableList<SpinnerGroup909Model>> = MutableLiveData()
}
