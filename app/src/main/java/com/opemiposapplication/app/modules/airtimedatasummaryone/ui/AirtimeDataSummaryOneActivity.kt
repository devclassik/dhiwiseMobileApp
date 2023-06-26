package com.opemiposapplication.app.modules.airtimedatasummaryone.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityAirtimeDataSummaryOneBinding
import com.opemiposapplication.app.modules.airtimedatasummaryone.`data`.viewmodel.AirtimeDataSummaryOneVM
import kotlin.String
import kotlin.Unit

class AirtimeDataSummaryOneActivity :
    BaseActivity<ActivityAirtimeDataSummaryOneBinding>(R.layout.activity_airtime_data_summary_one) {
  private val viewModel: AirtimeDataSummaryOneVM by viewModels<AirtimeDataSummaryOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.airtimeDataSummaryOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "AIRTIME_DATA_SUMMARY_ONE_ACTIVITY"

  }
}
