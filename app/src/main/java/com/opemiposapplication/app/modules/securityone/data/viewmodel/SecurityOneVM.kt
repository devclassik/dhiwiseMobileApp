package com.opemiposapplication.app.modules.securityone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.securityone.`data`.model.SecurityOneModel
import com.opemiposapplication.app.modules.securityone.`data`.model.SecurityOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SecurityOneVM : ViewModel(), KoinComponent {
  val securityOneModel: MutableLiveData<SecurityOneModel> = MutableLiveData(SecurityOneModel())

  var navArguments: Bundle? = null

  val securityOneList: MutableLiveData<MutableList<SecurityOneRowModel>> =
      MutableLiveData(mutableListOf())
}
