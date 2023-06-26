package com.opemiposapplication.app.modules.billpaymentbettinglottery.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.billpaymentbettinglottery.`data`.model.BillPaymentBettingLotteryModel
import com.opemiposapplication.app.modules.billpaymentbettinglottery.`data`.model.SpinnerGroup1669Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class BillPaymentBettingLotteryVM : ViewModel(), KoinComponent {
  val billPaymentBettingLotteryModel: MutableLiveData<BillPaymentBettingLotteryModel> =
      MutableLiveData(BillPaymentBettingLotteryModel())

  var navArguments: Bundle? = null

  val spinnerGroup1669List: MutableLiveData<MutableList<SpinnerGroup1669Model>> = MutableLiveData()
}
