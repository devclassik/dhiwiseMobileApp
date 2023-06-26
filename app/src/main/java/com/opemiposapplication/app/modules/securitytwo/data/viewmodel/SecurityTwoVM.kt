package com.opemiposapplication.app.modules.securitytwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.securitytwo.`data`.model.SecurityTwoModel
import com.opemiposapplication.app.modules.securitytwo.`data`.model.SecurityTwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SecurityTwoVM : ViewModel(), KoinComponent {
  val securityTwoModel: MutableLiveData<SecurityTwoModel> = MutableLiveData(SecurityTwoModel())

  var navArguments: Bundle? = null

  val securityTwoList: MutableLiveData<MutableList<SecurityTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
