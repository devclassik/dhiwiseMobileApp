package com.opemiposapplication.app.modules.supportemail.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseDialogFragment
import com.opemiposapplication.app.databinding.DialogSupportEmailBinding
import com.opemiposapplication.app.modules.supportemail.`data`.viewmodel.SupportEmailVM
import kotlin.String
import kotlin.Unit

class SupportEmailDialog :
    BaseDialogFragment<DialogSupportEmailBinding>(R.layout.dialog_support_email) {
  private val viewModel: SupportEmailVM by viewModels<SupportEmailVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.supportEmailVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SUPPORT_EMAIL_DIALOG"

  }
}
