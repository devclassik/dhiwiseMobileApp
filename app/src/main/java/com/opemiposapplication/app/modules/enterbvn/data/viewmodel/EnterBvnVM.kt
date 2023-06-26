package com.opemiposapplication.app.modules.enterbvn.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.enterbvn.`data`.model.EnterBvnModel
import org.koin.core.KoinComponent

class EnterBvnVM : ViewModel(), KoinComponent {
  val enterBvnModel: MutableLiveData<EnterBvnModel> = MutableLiveData(EnterBvnModel())

  var navArguments: Bundle? = null
}
