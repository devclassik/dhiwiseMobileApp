package com.opemiposapplication.app.modules.alltransactionsphonepay.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.alltransactionsphonepay.`data`.model.AllTransactionsPhonePayModel
import com.opemiposapplication.app.modules.alltransactionsphonepay.`data`.model.ListiconsaxlinearOne3RowModel
import com.opemiposapplication.app.modules.alltransactionsphonepay.`data`.model.SpinnerFrame1656Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AllTransactionsPhonePayVM : ViewModel(), KoinComponent {
  val allTransactionsPhonePayModel: MutableLiveData<AllTransactionsPhonePayModel> =
      MutableLiveData(AllTransactionsPhonePayModel())

  var navArguments: Bundle? = null

  val spinnerFrame1656List: MutableLiveData<MutableList<SpinnerFrame1656Model>> = MutableLiveData()

  val listiconsaxlinearOneList: MutableLiveData<MutableList<ListiconsaxlinearOne3RowModel>> =
      MutableLiveData(mutableListOf())
}
