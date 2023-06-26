package com.opemiposapplication.app.modules.phonepaytwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.phonepaytwo.`data`.model.PhonePayTwoModel
import com.opemiposapplication.app.modules.phonepaytwo.`data`.model.PhonePayTwoRowModel
import com.opemiposapplication.app.modules.phonepaytwo.`data`.model.SpinnerGroup911Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PhonePayTwoVM : ViewModel(), KoinComponent {
  val phonePayTwoModel: MutableLiveData<PhonePayTwoModel> = MutableLiveData(PhonePayTwoModel())

  var navArguments: Bundle? = null

  val spinnerGroup911List: MutableLiveData<MutableList<SpinnerGroup911Model>> = MutableLiveData()

  val phonePayTwoList: MutableLiveData<MutableList<PhonePayTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
