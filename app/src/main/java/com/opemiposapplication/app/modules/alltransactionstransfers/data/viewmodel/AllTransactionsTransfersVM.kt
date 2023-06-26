package com.opemiposapplication.app.modules.alltransactionstransfers.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.alltransactionstransfers.`data`.model.AllTransactionsTransfersModel
import com.opemiposapplication.app.modules.alltransactionstransfers.`data`.model.Listmaximize6RowModel
import com.opemiposapplication.app.modules.alltransactionstransfers.`data`.model.SpinnerFrame1656Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AllTransactionsTransfersVM : ViewModel(), KoinComponent {
  val allTransactionsTransfersModel: MutableLiveData<AllTransactionsTransfersModel> =
      MutableLiveData(AllTransactionsTransfersModel())

  var navArguments: Bundle? = null

  val spinnerFrame1656List: MutableLiveData<MutableList<SpinnerFrame1656Model>> = MutableLiveData()

  val listmaximizeList: MutableLiveData<MutableList<Listmaximize6RowModel>> =
      MutableLiveData(mutableListOf())
}
