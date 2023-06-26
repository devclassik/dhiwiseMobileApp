package com.opemiposapplication.app.modules.airtimedatabeneficiaryone.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityAirtimeDataBeneficiaryOneBinding
import com.opemiposapplication.app.modules.airtimedatabeneficiaryone.`data`.viewmodel.AirtimeDataBeneficiaryOneVM
import kotlin.String
import kotlin.Unit

class AirtimeDataBeneficiaryOneActivity :
    BaseActivity<ActivityAirtimeDataBeneficiaryOneBinding>(R.layout.activity_airtime_data_beneficiary_one)
    {
  private val viewModel: AirtimeDataBeneficiaryOneVM by viewModels<AirtimeDataBeneficiaryOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.airtimeDataBeneficiaryOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "AIRTIME_DATA_BENEFICIARY_ONE_ACTIVITY"

  }
}
