package com.opemiposapplication.app.modules.personalinformation.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityPersonalInformationBinding
import com.opemiposapplication.app.modules.personalinformation.`data`.model.SpinnerGroup111Model
import com.opemiposapplication.app.modules.personalinformation.`data`.model.SpinnerGroupTwentyModel
import com.opemiposapplication.app.modules.personalinformation.`data`.model.SpinnerGroupTwentyThreeModel
import com.opemiposapplication.app.modules.personalinformation.`data`.viewmodel.PersonalInformationVM
import kotlin.String
import kotlin.Unit

class PersonalInformationActivity :
    BaseActivity<ActivityPersonalInformationBinding>(R.layout.activity_personal_information) {
  private val viewModel: PersonalInformationVM by viewModels<PersonalInformationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroupTwentyList.value = mutableListOf(
    SpinnerGroupTwentyModel("Item1"),
    SpinnerGroupTwentyModel("Item2"),
    SpinnerGroupTwentyModel("Item3"),
    SpinnerGroupTwentyModel("Item4"),
    SpinnerGroupTwentyModel("Item5")
    )
    val spinnerGroupTwentyAdapter =
    SpinnerGroupTwentyAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupTwentyList.value?:
    mutableListOf())
    binding.spinnerGroupTwenty.adapter = spinnerGroupTwentyAdapter
    viewModel.spinnerGroupTwentyThreeList.value = mutableListOf(
    SpinnerGroupTwentyThreeModel("Item1"),
    SpinnerGroupTwentyThreeModel("Item2"),
    SpinnerGroupTwentyThreeModel("Item3"),
    SpinnerGroupTwentyThreeModel("Item4"),
    SpinnerGroupTwentyThreeModel("Item5")
    )
    val spinnerGroupTwentyThreeAdapter =
    SpinnerGroupTwentyThreeAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupTwentyThreeList.value?:
    mutableListOf())
    binding.spinnerGroupTwentyThree.adapter = spinnerGroupTwentyThreeAdapter
    viewModel.spinnerGroup111List.value = mutableListOf(
    SpinnerGroup111Model("Item1"),
    SpinnerGroup111Model("Item2"),
    SpinnerGroup111Model("Item3"),
    SpinnerGroup111Model("Item4"),
    SpinnerGroup111Model("Item5")
    )
    val spinnerGroup111Adapter =
    SpinnerGroup111Adapter(this,R.layout.spinner_item,viewModel.spinnerGroup111List.value?:
    mutableListOf())
    binding.spinnerGroup111.adapter = spinnerGroup111Adapter
    binding.personalInformationVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PERSONAL_INFORMATION_ACTIVITY"

  }
}
