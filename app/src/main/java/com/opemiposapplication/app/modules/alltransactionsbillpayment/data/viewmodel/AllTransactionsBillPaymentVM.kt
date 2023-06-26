package com.opemiposapplication.app.modules.alltransactionsbillpayment.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.alltransactionsbillpayment.`data`.model.AllTransactionsBillPaymentModel
import com.opemiposapplication.app.modules.alltransactionsbillpayment.`data`.model.ListiconsaxlinearOne1RowModel
import com.opemiposapplication.app.modules.alltransactionsbillpayment.`data`.model.SpinnerFrame1656Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AllTransactionsBillPaymentVM : ViewModel(), KoinComponent {
  val allTransactionsBillPaymentModel: MutableLiveData<AllTransactionsBillPaymentModel> =
      MutableLiveData(AllTransactionsBillPaymentModel())

  var navArguments: Bundle? = null

  val spinnerFrame1656List: MutableLiveData<MutableList<SpinnerFrame1656Model>> = MutableLiveData()

  val listiconsaxlinearOneList: MutableLiveData<MutableList<ListiconsaxlinearOne1RowModel>> =
      MutableLiveData(mutableListOf())
}
