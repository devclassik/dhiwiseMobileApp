package com.opemiposapplication.app.modules.alltransactionsairtimedata.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.alltransactionsairtimedata.`data`.model.AllTransactionsAirtimeDataModel
import com.opemiposapplication.app.modules.alltransactionsairtimedata.`data`.model.ListiconsaxlinearOneRowModel
import com.opemiposapplication.app.modules.alltransactionsairtimedata.`data`.model.SpinnerFrame1656Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AllTransactionsAirtimeDataVM : ViewModel(), KoinComponent {
  val allTransactionsAirtimeDataModel: MutableLiveData<AllTransactionsAirtimeDataModel> =
      MutableLiveData(AllTransactionsAirtimeDataModel())

  var navArguments: Bundle? = null

  val spinnerFrame1656List: MutableLiveData<MutableList<SpinnerFrame1656Model>> = MutableLiveData()

  val listiconsaxlinearOneList: MutableLiveData<MutableList<ListiconsaxlinearOneRowModel>> =
      MutableLiveData(mutableListOf())
}
