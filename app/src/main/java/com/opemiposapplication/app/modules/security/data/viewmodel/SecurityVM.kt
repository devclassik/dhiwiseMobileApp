package com.opemiposapplication.app.modules.security.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.security.`data`.model.SecurityModel
import com.opemiposapplication.app.modules.security.`data`.model.SecurityRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SecurityVM : ViewModel(), KoinComponent {
  val securityModel: MutableLiveData<SecurityModel> = MutableLiveData(SecurityModel())

  var navArguments: Bundle? = null

  val securityList: MutableLiveData<MutableList<SecurityRowModel>> =
      MutableLiveData(mutableListOf())
}
