package com.opemiposapplication.app.modules.phonepaytwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.phonepaytwo.`data`.model.PhonePayTwoModel
import com.opemiposapplication.app.modules.phonepaytwo.`data`.model.PhonePayTwoRowModel
import com.opemiposapplication.app.modules.phonepaytwo.`data`.model.SpinnerGroup117Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PhonePayTwoVM : ViewModel(), KoinComponent {
  val phonePayTwoModel: MutableLiveData<PhonePayTwoModel> = MutableLiveData(PhonePayTwoModel())

  var navArguments: Bundle? = null

  val spinnerGroup117List: MutableLiveData<MutableList<SpinnerGroup117Model>> = MutableLiveData()

  val phonePayTwoList: MutableLiveData<MutableList<PhonePayTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
