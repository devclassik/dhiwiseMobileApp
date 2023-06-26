package com.opemiposapplication.app.modules.airtimedatasummary.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityAirtimeDataSummaryBinding
import com.opemiposapplication.app.modules.airtimedatasummary.`data`.viewmodel.AirtimeDataSummaryVM
import kotlin.String
import kotlin.Unit

class AirtimeDataSummaryActivity :
    BaseActivity<ActivityAirtimeDataSummaryBinding>(R.layout.activity_airtime_data_summary) {
  private val viewModel: AirtimeDataSummaryVM by viewModels<AirtimeDataSummaryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.airtimeDataSummaryVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "AIRTIME_DATA_SUMMARY_ACTIVITY"

  }
}
