package com.opemiposapplication.app.modules.alltransactionsall.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.alltransactionsall.`data`.model.AllTransactionsAllModel
import com.opemiposapplication.app.modules.alltransactionsall.`data`.model.Listmaximize5RowModel
import com.opemiposapplication.app.modules.alltransactionsall.`data`.model.SpinnerFrame1656Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AllTransactionsAllVM : ViewModel(), KoinComponent {
  val allTransactionsAllModel: MutableLiveData<AllTransactionsAllModel> =
      MutableLiveData(AllTransactionsAllModel())

  var navArguments: Bundle? = null

  val spinnerFrame1656List: MutableLiveData<MutableList<SpinnerFrame1656Model>> = MutableLiveData()

  val listmaximizeList: MutableLiveData<MutableList<Listmaximize5RowModel>> =
      MutableLiveData(mutableListOf())
}
