package com.opemiposapplication.app.modules.alltransactionstransfersone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.alltransactionstransfersone.`data`.model.AllTransactionsTransfersOneModel
import com.opemiposapplication.app.modules.alltransactionstransfersone.`data`.model.Listmaximize7RowModel
import com.opemiposapplication.app.modules.alltransactionstransfersone.`data`.model.SpinnerFrame1656Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AllTransactionsTransfersOneVM : ViewModel(), KoinComponent {
  val allTransactionsTransfersOneModel: MutableLiveData<AllTransactionsTransfersOneModel> =
      MutableLiveData(AllTransactionsTransfersOneModel())

  var navArguments: Bundle? = null

  val spinnerFrame1656List: MutableLiveData<MutableList<SpinnerFrame1656Model>> = MutableLiveData()

  val listmaximizeList: MutableLiveData<MutableList<Listmaximize7RowModel>> =
      MutableLiveData(mutableListOf())
}
