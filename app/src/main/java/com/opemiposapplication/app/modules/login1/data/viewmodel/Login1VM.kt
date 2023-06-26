package com.opemiposapplication.app.modules.login1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.login1.`data`.model.Login1Model
import org.koin.core.KoinComponent

class Login1VM : ViewModel(), KoinComponent {
  val login1Model: MutableLiveData<Login1Model> = MutableLiveData(Login1Model())

  var navArguments: Bundle? = null
}
