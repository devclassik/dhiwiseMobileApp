package com.opemiposapplication.app.modules.airtimedataamountone.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityAirtimeDataAmountOneBinding
import com.opemiposapplication.app.modules.airtimedataamountone.`data`.model.SpinnerFilesizeModel
import com.opemiposapplication.app.modules.airtimedataamountone.`data`.viewmodel.AirtimeDataAmountOneVM
import kotlin.String
import kotlin.Unit

class AirtimeDataAmountOneActivity :
    BaseActivity<ActivityAirtimeDataAmountOneBinding>(R.layout.activity_airtime_data_amount_one) {
  private val viewModel: AirtimeDataAmountOneVM by viewModels<AirtimeDataAmountOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerFilesizeList.value = mutableListOf(
    SpinnerFilesizeModel("Item1"),
    SpinnerFilesizeModel("Item2"),
    SpinnerFilesizeModel("Item3"),
    SpinnerFilesizeModel("Item4"),
    SpinnerFilesizeModel("Item5")
    )
    val spinnerFilesizeAdapter =
    SpinnerFilesizeAdapter(this,R.layout.spinner_item,viewModel.spinnerFilesizeList.value?:
    mutableListOf())
    binding.spinnerFilesize.adapter = spinnerFilesizeAdapter
    binding.airtimeDataAmountOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "AIRTIME_DATA_AMOUNT_ONE_ACTIVITY"

  }
}
