package com.opemiposapplication.app.modules.onboardtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.onboardtwo.`data`.model.OnboardTwoModel
import org.koin.core.KoinComponent

class OnboardTwoVM : ViewModel(), KoinComponent {
  val onboardTwoModel: MutableLiveData<OnboardTwoModel> = MutableLiveData(OnboardTwoModel())

  var navArguments: Bundle? = null
}
