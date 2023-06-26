package com.opemiposapplication.app.modules.onboardthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.onboardthree.`data`.model.OnboardThreeModel
import org.koin.core.KoinComponent

class OnboardThreeVM : ViewModel(), KoinComponent {
  val onboardThreeModel: MutableLiveData<OnboardThreeModel> = MutableLiveData(OnboardThreeModel())

  var navArguments: Bundle? = null
}
