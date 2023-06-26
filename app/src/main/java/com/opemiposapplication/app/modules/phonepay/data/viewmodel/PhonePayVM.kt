package com.opemiposapplication.app.modules.phonepay.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.phonepay.`data`.model.PhonePayModel
import com.opemiposapplication.app.modules.phonepay.`data`.model.SpinnerGroup1669OneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PhonePayVM : ViewModel(), KoinComponent {
  val phonePayModel: MutableLiveData<PhonePayModel> = MutableLiveData(PhonePayModel())

  var navArguments: Bundle? = null

  val spinnerGroup1669OneList: MutableLiveData<MutableList<SpinnerGroup1669OneModel>> =
      MutableLiveData()
}
