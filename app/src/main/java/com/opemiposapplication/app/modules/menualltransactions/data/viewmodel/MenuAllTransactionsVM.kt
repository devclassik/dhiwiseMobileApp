package com.opemiposapplication.app.modules.menualltransactions.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.menualltransactions.`data`.model.ListiconsaxlinearFiveRowModel
import com.opemiposapplication.app.modules.menualltransactions.`data`.model.ListiconsaxlinearTwoRowModel
import com.opemiposapplication.app.modules.menualltransactions.`data`.model.Listmaximize4RowModel
import com.opemiposapplication.app.modules.menualltransactions.`data`.model.MenuAllTransactionsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MenuAllTransactionsVM : ViewModel(), KoinComponent {
  val menuAllTransactionsModel: MutableLiveData<MenuAllTransactionsModel> =
      MutableLiveData(MenuAllTransactionsModel())

  var navArguments: Bundle? = null

  val listmaximizeList: MutableLiveData<MutableList<Listmaximize4RowModel>> =
      MutableLiveData(mutableListOf())

  val listiconsaxlinearTwoList: MutableLiveData<MutableList<ListiconsaxlinearTwoRowModel>> =
      MutableLiveData(mutableListOf())

  val listiconsaxlinearFiveList: MutableLiveData<MutableList<ListiconsaxlinearFiveRowModel>> =
      MutableLiveData(mutableListOf())
}
