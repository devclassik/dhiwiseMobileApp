package com.opemiposapplication.app.modules.onboardone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.onboardone.`data`.model.OnboardOneModel
import org.koin.core.KoinComponent

class OnboardOneVM : ViewModel(), KoinComponent {
  val onboardOneModel: MutableLiveData<OnboardOneModel> = MutableLiveData(OnboardOneModel())

  var navArguments: Bundle? = null
}
