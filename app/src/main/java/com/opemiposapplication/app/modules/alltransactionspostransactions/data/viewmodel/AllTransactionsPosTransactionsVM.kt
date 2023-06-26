package com.opemiposapplication.app.modules.alltransactionspostransactions.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.alltransactionspostransactions.`data`.model.AllTransactionsPosTransactionsModel
import com.opemiposapplication.app.modules.alltransactionspostransactions.`data`.model.ListiconsaxlinearOne2RowModel
import com.opemiposapplication.app.modules.alltransactionspostransactions.`data`.model.SpinnerLanguageModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AllTransactionsPosTransactionsVM : ViewModel(), KoinComponent {
  val allTransactionsPosTransactionsModel: MutableLiveData<AllTransactionsPosTransactionsModel> =
      MutableLiveData(AllTransactionsPosTransactionsModel())

  var navArguments: Bundle? = null

  val spinnerLanguageList: MutableLiveData<MutableList<SpinnerLanguageModel>> = MutableLiveData()

  val listiconsaxlinearOneList: MutableLiveData<MutableList<ListiconsaxlinearOne2RowModel>> =
      MutableLiveData(mutableListOf())
}
