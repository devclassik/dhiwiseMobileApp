package com.opemiposapplication.app.modules.transactionsuccessful.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseDialogFragment
import com.opemiposapplication.app.databinding.DialogTransactionSuccessfulBinding
import com.opemiposapplication.app.modules.transactionsuccessful.`data`.viewmodel.TransactionSuccessfulVM
import kotlin.String
import kotlin.Unit

class TransactionSuccessfulDialog :
    BaseDialogFragment<DialogTransactionSuccessfulBinding>(R.layout.dialog_transaction_successful) {
  private val viewModel: TransactionSuccessfulVM by viewModels<TransactionSuccessfulVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.transactionSuccessfulVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TRANSACTION_SUCCESSFUL_DIALOG"

  }
}
