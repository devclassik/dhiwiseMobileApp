package com.opemiposapplication.app.modules.menudashboard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.menudashboard.`data`.model.ListmaximizeRowModel
import com.opemiposapplication.app.modules.menudashboard.`data`.model.MenuDashboardModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MenuDashboardVM : ViewModel(), KoinComponent {
  val menuDashboardModel: MutableLiveData<MenuDashboardModel> =
      MutableLiveData(MenuDashboardModel())

  var navArguments: Bundle? = null

  val listmaximizeList: MutableLiveData<MutableList<ListmaximizeRowModel>> =
      MutableLiveData(mutableListOf())
}
