package com.opemiposapplication.app.modules.welcomeback.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.welcomeback.`data`.model.WelcomeBackModel
import org.koin.core.KoinComponent

class WelcomeBackVM : ViewModel(), KoinComponent {
  val welcomeBackModel: MutableLiveData<WelcomeBackModel> = MutableLiveData(WelcomeBackModel())

  var navArguments: Bundle? = null
}
