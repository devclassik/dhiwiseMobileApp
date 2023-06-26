package com.opemiposapplication.app.modules.loginone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.loginone.`data`.model.LoginOneModel
import com.opemiposapplication.app.modules.loginone.`data`.model.SpinnerGroup113Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LoginOneVM : ViewModel(), KoinComponent {
  val loginOneModel: MutableLiveData<LoginOneModel> = MutableLiveData(LoginOneModel())

  var navArguments: Bundle? = null

  val spinnerGroup113List: MutableLiveData<MutableList<SpinnerGroup113Model>> = MutableLiveData()
}
