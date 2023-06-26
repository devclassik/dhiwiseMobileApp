package com.opemiposapplication.app.modules.securityfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.securityfour.`data`.model.SecurityFourModel
import com.opemiposapplication.app.modules.securityfour.`data`.model.SecurityFourRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SecurityFourVM : ViewModel(), KoinComponent {
  val securityFourModel: MutableLiveData<SecurityFourModel> = MutableLiveData(SecurityFourModel())

  var navArguments: Bundle? = null

  val securityFourList: MutableLiveData<MutableList<SecurityFourRowModel>> =
      MutableLiveData(mutableListOf())
}
