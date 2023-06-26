package com.opemiposapplication.app.modules.phonepayone.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityPhonePayOneBinding
import com.opemiposapplication.app.modules.phonepayone.`data`.model.SpinnerGroup115Model
import com.opemiposapplication.app.modules.phonepayone.`data`.viewmodel.PhonePayOneVM
import kotlin.String
import kotlin.Unit

class PhonePayOneActivity :
    BaseActivity<ActivityPhonePayOneBinding>(R.layout.activity_phone_pay_one) {
  private val viewModel: PhonePayOneVM by viewModels<PhonePayOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroup115List.value = mutableListOf(
    SpinnerGroup115Model("Item1"),
    SpinnerGroup115Model("Item2"),
    SpinnerGroup115Model("Item3"),
    SpinnerGroup115Model("Item4"),
    SpinnerGroup115Model("Item5")
    )
    val spinnerGroup115Adapter =
    SpinnerGroup115Adapter(this,R.layout.spinner_item,viewModel.spinnerGroup115List.value?:
    mutableListOf())
    binding.spinnerGroup115.adapter = spinnerGroup115Adapter
    binding.phonePayOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PHONE_PAY_ONE_ACTIVITY"

  }
}
