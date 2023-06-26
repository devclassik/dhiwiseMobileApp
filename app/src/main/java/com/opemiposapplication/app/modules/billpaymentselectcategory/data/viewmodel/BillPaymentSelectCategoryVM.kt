package com.opemiposapplication.app.modules.billpaymentselectcategory.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.billpaymentselectcategory.`data`.model.BillPaymentSelectCategoryModel
import com.opemiposapplication.app.modules.billpaymentselectcategory.`data`.model.ListlockRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class BillPaymentSelectCategoryVM : ViewModel(), KoinComponent {
  val billPaymentSelectCategoryModel: MutableLiveData<BillPaymentSelectCategoryModel> =
      MutableLiveData(BillPaymentSelectCategoryModel())

  var navArguments: Bundle? = null

  val listlockList: MutableLiveData<MutableList<ListlockRowModel>> =
      MutableLiveData(mutableListOf())
}
