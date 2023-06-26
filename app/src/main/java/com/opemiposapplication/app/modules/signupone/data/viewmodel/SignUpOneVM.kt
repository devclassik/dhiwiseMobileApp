package com.opemiposapplication.app.modules.signupone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.signupone.`data`.model.SignUpOneModel
import com.opemiposapplication.app.modules.signupone.`data`.model.SpinnerGroup109Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SignUpOneVM : ViewModel(), KoinComponent {
  val signUpOneModel: MutableLiveData<SignUpOneModel> = MutableLiveData(SignUpOneModel())

  var navArguments: Bundle? = null

  val spinnerGroup109List: MutableLiveData<MutableList<SpinnerGroup109Model>> = MutableLiveData()
}
