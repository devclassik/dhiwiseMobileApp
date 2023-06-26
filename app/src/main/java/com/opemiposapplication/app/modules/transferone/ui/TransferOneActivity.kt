package com.opemiposapplication.app.modules.transferone.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityTransferOneBinding
import com.opemiposapplication.app.modules.transferone.`data`.model.SpinnerGroup1669OneModel
import com.opemiposapplication.app.modules.transferone.`data`.viewmodel.TransferOneVM
import kotlin.String
import kotlin.Unit

class TransferOneActivity : BaseActivity<ActivityTransferOneBinding>(R.layout.activity_transfer_one)
    {
  private val viewModel: TransferOneVM by viewModels<TransferOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroup1669OneList.value = mutableListOf(
    SpinnerGroup1669OneModel("Item1"),
    SpinnerGroup1669OneModel("Item2"),
    SpinnerGroup1669OneModel("Item3"),
    SpinnerGroup1669OneModel("Item4"),
    SpinnerGroup1669OneModel("Item5")
    )
    val spinnerGroup1669OneAdapter =
    SpinnerGroup1669OneAdapter(this,R.layout.spinner_item,viewModel.spinnerGroup1669OneList.value?:
    mutableListOf())
    binding.spinnerGroup1669One.adapter = spinnerGroup1669OneAdapter
    binding.transferOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TRANSFER_ONE_ACTIVITY"

  }
}
