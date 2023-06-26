package com.opemiposapplication.app.modules.menusupport.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.menusupport.`data`.model.MenuSupportModel
import com.opemiposapplication.app.modules.menusupport.`data`.model.MenuSupportRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MenuSupportVM : ViewModel(), KoinComponent {
  val menuSupportModel: MutableLiveData<MenuSupportModel> = MutableLiveData(MenuSupportModel())

  var navArguments: Bundle? = null

  val menuSupportList: MutableLiveData<MutableList<MenuSupportRowModel>> =
      MutableLiveData(mutableListOf())
}
