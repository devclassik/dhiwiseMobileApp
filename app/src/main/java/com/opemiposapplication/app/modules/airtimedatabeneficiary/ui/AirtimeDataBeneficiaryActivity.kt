package com.opemiposapplication.app.modules.airtimedatabeneficiary.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityAirtimeDataBeneficiaryBinding
import com.opemiposapplication.app.modules.airtimedatabeneficiary.`data`.viewmodel.AirtimeDataBeneficiaryVM
import kotlin.String
import kotlin.Unit

class AirtimeDataBeneficiaryActivity :
    BaseActivity<ActivityAirtimeDataBeneficiaryBinding>(R.layout.activity_airtime_data_beneficiary)
    {
  private val viewModel: AirtimeDataBeneficiaryVM by viewModels<AirtimeDataBeneficiaryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.airtimeDataBeneficiaryVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "AIRTIME_DATA_BENEFICIARY_ACTIVITY"

  }
}
