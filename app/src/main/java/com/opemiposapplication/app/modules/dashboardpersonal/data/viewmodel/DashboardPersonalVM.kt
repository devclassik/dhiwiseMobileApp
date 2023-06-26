package com.opemiposapplication.app.modules.dashboardpersonal.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.dashboardpersonal.`data`.model.DashboardPersonalModel
import com.opemiposapplication.app.modules.dashboardpersonal.`data`.model.Listmaximize3RowModel
import com.opemiposapplication.app.modules.dashboardpersonal.`data`.model.SpinnerDropdownModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DashboardPersonalVM : ViewModel(), KoinComponent {
  val dashboardPersonalModel: MutableLiveData<DashboardPersonalModel> =
      MutableLiveData(DashboardPersonalModel())

  var navArguments: Bundle? = null

  val spinnerDropdownList: MutableLiveData<MutableList<SpinnerDropdownModel>> = MutableLiveData()

  val listmaximizeList: MutableLiveData<MutableList<Listmaximize3RowModel>> =
      MutableLiveData(mutableListOf())
}
