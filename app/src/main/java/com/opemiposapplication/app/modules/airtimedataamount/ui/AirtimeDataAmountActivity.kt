package com.opemiposapplication.app.modules.airtimedataamount.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityAirtimeDataAmountBinding
import com.opemiposapplication.app.modules.airtimedataamount.`data`.model.SpinnerFilesizeModel
import com.opemiposapplication.app.modules.airtimedataamount.`data`.viewmodel.AirtimeDataAmountVM
import kotlin.String
import kotlin.Unit

class AirtimeDataAmountActivity :
    BaseActivity<ActivityAirtimeDataAmountBinding>(R.layout.activity_airtime_data_amount) {
  private val viewModel: AirtimeDataAmountVM by viewModels<AirtimeDataAmountVM>()

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
    binding.airtimeDataAmountVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "AIRTIME_DATA_AMOUNT_ACTIVITY"

  }
}
