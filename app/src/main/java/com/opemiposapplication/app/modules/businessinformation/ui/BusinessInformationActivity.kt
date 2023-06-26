package com.opemiposapplication.app.modules.businessinformation.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityBusinessInformationBinding
import com.opemiposapplication.app.modules.businessinformation.`data`.model.SpinnerGroupFiveModel
import com.opemiposapplication.app.modules.businessinformation.`data`.viewmodel.BusinessInformationVM
import kotlin.String
import kotlin.Unit

class BusinessInformationActivity :
    BaseActivity<ActivityBusinessInformationBinding>(R.layout.activity_business_information) {
  private val viewModel: BusinessInformationVM by viewModels<BusinessInformationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroupFiveList.value = mutableListOf(
    SpinnerGroupFiveModel("Item1"),
    SpinnerGroupFiveModel("Item2"),
    SpinnerGroupFiveModel("Item3"),
    SpinnerGroupFiveModel("Item4"),
    SpinnerGroupFiveModel("Item5")
    )
    val spinnerGroupFiveAdapter =
    SpinnerGroupFiveAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupFiveList.value?:
    mutableListOf())
    binding.spinnerGroupFive.adapter = spinnerGroupFiveAdapter
    binding.businessInformationVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "BUSINESS_INFORMATION_ACTIVITY"

  }
}
