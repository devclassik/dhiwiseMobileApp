package com.opemiposapplication.app.modules.transfertwo.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityTransferTwoBinding
import com.opemiposapplication.app.modules.transfertwo.`data`.viewmodel.TransferTwoVM
import kotlin.String
import kotlin.Unit

class TransferTwoActivity : BaseActivity<ActivityTransferTwoBinding>(R.layout.activity_transfer_two)
    {
  private val viewModel: TransferTwoVM by viewModels<TransferTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.transferTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "TRANSFER_TWO_ACTIVITY"

  }
}
