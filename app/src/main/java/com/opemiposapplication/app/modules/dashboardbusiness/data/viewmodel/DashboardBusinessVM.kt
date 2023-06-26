package com.opemiposapplication.app.modules.dashboardbusiness.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.dashboardbusiness.`data`.model.DashboardBusinessModel
import com.opemiposapplication.app.modules.dashboardbusiness.`data`.model.Listmaximize1RowModel
import com.opemiposapplication.app.modules.dashboardbusiness.`data`.model.SpinnerDropdownModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DashboardBusinessVM : ViewModel(), KoinComponent {
  val dashboardBusinessModel: MutableLiveData<DashboardBusinessModel> =
      MutableLiveData(DashboardBusinessModel())

  var navArguments: Bundle? = null

  val spinnerDropdownList: MutableLiveData<MutableList<SpinnerDropdownModel>> = MutableLiveData()

  val listmaximizeList: MutableLiveData<MutableList<Listmaximize1RowModel>> =
      MutableLiveData(mutableListOf())
}
