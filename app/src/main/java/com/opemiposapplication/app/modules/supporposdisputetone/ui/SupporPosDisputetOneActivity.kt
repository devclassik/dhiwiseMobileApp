package com.opemiposapplication.app.modules.supporposdisputetone.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivitySupporPosDisputetOneBinding
import com.opemiposapplication.app.modules.supporposdisputetone.`data`.model.SpinnerFrame1656Model
import com.opemiposapplication.app.modules.supporposdisputetone.`data`.viewmodel.SupporPosDisputetOneVM
import kotlin.String
import kotlin.Unit

class SupporPosDisputetOneActivity :
    BaseActivity<ActivitySupporPosDisputetOneBinding>(R.layout.activity_suppor_pos_disputet_one) {
  private val viewModel: SupporPosDisputetOneVM by viewModels<SupporPosDisputetOneVM>()

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
    binding.supporPosDisputetOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SUPPOR_POS_DISPUTET_ONE_ACTIVITY"

  }
}
