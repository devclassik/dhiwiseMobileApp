package com.opemiposapplication.app.modules.menudashboardone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.menudashboardone.`data`.model.Listmaximize2RowModel
import com.opemiposapplication.app.modules.menudashboardone.`data`.model.MenuDashboardOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MenuDashboardOneVM : ViewModel(), KoinComponent {
  val menuDashboardOneModel: MutableLiveData<MenuDashboardOneModel> =
      MutableLiveData(MenuDashboardOneModel())

  var navArguments: Bundle? = null

  val listmaximizeList: MutableLiveData<MutableList<Listmaximize2RowModel>> =
      MutableLiveData(mutableListOf())
}
