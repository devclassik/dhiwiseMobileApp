package com.opemiposapplication.app.modules.supportcallus.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseDialogFragment
import com.opemiposapplication.app.databinding.DialogSupportCallUsBinding
import com.opemiposapplication.app.modules.supportcallus.`data`.viewmodel.SupportCallUsVM
import kotlin.String
import kotlin.Unit

class SupportCallUsDialog :
    BaseDialogFragment<DialogSupportCallUsBinding>(R.layout.dialog_support_call_us) {
  private val viewModel: SupportCallUsVM by viewModels<SupportCallUsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.supportCallUsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SUPPORT_CALL_US_DIALOG"

  }
}
