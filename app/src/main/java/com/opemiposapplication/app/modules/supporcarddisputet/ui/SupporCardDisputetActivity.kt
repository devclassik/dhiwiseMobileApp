package com.opemiposapplication.app.modules.supporcarddisputet.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivitySupporCardDisputetBinding
import com.opemiposapplication.app.modules.supporcarddisputet.`data`.model.SpinnerFrame1656Model
import com.opemiposapplication.app.modules.supporcarddisputet.`data`.viewmodel.SupporCardDisputetVM
import kotlin.String
import kotlin.Unit

class SupporCardDisputetActivity :
    BaseActivity<ActivitySupporCardDisputetBinding>(R.layout.activity_suppor_card_disputet) {
  private val viewModel: SupporCardDisputetVM by viewModels<SupporCardDisputetVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerFrame1656List.value = mutableListOf(
    SpinnerFrame1656Model("Item1"),
    SpinnerFrame1656Model("Item2"),
    SpinnerFrame1656Model("Item3"),
    SpinnerFrame1656Model("Item4"),
    SpinnerFrame1656Model("Item5")
    )
    val spinnerFrame1656Adapter =
    SpinnerFrame1656Adapter(this,R.layout.spinner_item,viewModel.spinnerFrame1656List.value?:
    mutableListOf())
    binding.spinnerFrame1656.adapter = spinnerFrame1656Adapter
    binding.supporCardDisputetVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SUPPOR_CARD_DISPUTET_ACTIVITY"

  }
}
