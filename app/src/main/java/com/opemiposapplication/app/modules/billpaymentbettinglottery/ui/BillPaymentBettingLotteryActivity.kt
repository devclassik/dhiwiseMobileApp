package com.opemiposapplication.app.modules.billpaymentbettinglottery.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityBillPaymentBettingLotteryBinding
import com.opemiposapplication.app.modules.billpaymentbettinglottery.`data`.model.SpinnerGroup1669Model
import com.opemiposapplication.app.modules.billpaymentbettinglottery.`data`.viewmodel.BillPaymentBettingLotteryVM
import kotlin.String
import kotlin.Unit

class BillPaymentBettingLotteryActivity :
    BaseActivity<ActivityBillPaymentBettingLotteryBinding>(R.layout.activity_bill_payment_betting_lottery)
    {
  private val viewModel: BillPaymentBettingLotteryVM by viewModels<BillPaymentBettingLotteryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroup1669List.value = mutableListOf(
    SpinnerGroup1669Model("Item1"),
    SpinnerGroup1669Model("Item2"),
    SpinnerGroup1669Model("Item3"),
    SpinnerGroup1669Model("Item4"),
    SpinnerGroup1669Model("Item5")
    )
    val spinnerGroup1669Adapter =
    SpinnerGroup1669Adapter(this,R.layout.spinner_item,viewModel.spinnerGroup1669List.value?:
    mutableListOf())
    binding.spinnerGroup1669.adapter = spinnerGroup1669Adapter
    binding.billPaymentBettingLotteryVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "BILL_PAYMENT_BETTING_LOTTERY_ACTIVITY"

  }
}
