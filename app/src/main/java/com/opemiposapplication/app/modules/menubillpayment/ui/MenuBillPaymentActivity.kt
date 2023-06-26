package com.opemiposapplication.app.modules.menubillpayment.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityMenuBillPaymentBinding
import com.opemiposapplication.app.modules.menubillpayment.`data`.viewmodel.MenuBillPaymentVM
import kotlin.String
import kotlin.Unit

class MenuBillPaymentActivity :
    BaseActivity<ActivityMenuBillPaymentBinding>(R.layout.activity_menu_bill_payment) {
  private val viewModel: MenuBillPaymentVM by viewModels<MenuBillPaymentVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menuBillPaymentVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MENU_BILL_PAYMENT_ACTIVITY"

  }
}
