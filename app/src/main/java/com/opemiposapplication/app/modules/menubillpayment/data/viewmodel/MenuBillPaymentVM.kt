package com.opemiposapplication.app.modules.menubillpayment.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.menubillpayment.`data`.model.MenuBillPaymentModel
import org.koin.core.KoinComponent

class MenuBillPaymentVM : ViewModel(), KoinComponent {
  val menuBillPaymentModel: MutableLiveData<MenuBillPaymentModel> =
      MutableLiveData(MenuBillPaymentModel())

  var navArguments: Bundle? = null
}
