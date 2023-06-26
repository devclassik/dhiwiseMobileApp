package com.opemiposapplication.app.modules.phonepaythree.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityPhonePayThreeBinding
import com.opemiposapplication.app.modules.phonepaythree.`data`.viewmodel.PhonePayThreeVM
import kotlin.String
import kotlin.Unit

class PhonePayThreeActivity :
    BaseActivity<ActivityPhonePayThreeBinding>(R.layout.activity_phone_pay_three) {
  private val viewModel: PhonePayThreeVM by viewModels<PhonePayThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.phonePayThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PHONE_PAY_THREE_ACTIVITY"

  }
}
