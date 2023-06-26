package com.opemiposapplication.app.modules.signuptwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.signuptwo.`data`.model.SignUpTwoModel
import org.koin.core.KoinComponent

class SignUpTwoVM : ViewModel(), KoinComponent {
  val signUpTwoModel: MutableLiveData<SignUpTwoModel> = MutableLiveData(SignUpTwoModel())

  var navArguments: Bundle? = null
}
