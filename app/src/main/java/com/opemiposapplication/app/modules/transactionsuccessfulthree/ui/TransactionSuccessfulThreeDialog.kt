package com.opemiposapplication.app.modules.transactionsuccessfulthree.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseDialogFragment
import com.opemiposapplication.app.databinding.DialogTransactionSuccessfulThreeBinding
import com.opemiposapplication.app.modules.transactionsuccessfulthree.`data`.viewmodel.TransactionSuccessfulThreeVM
import kotlin.String
import kotlin.Unit

class TransactionSuccessfulThreeDialog :
    BaseDialogFragment<DialogTransactionSuccessfulThreeBinding>(R.layout.dialog_transaction_successful_three)
    {
  private val viewModel: TransactionSuccessfulThreeVM by viewModels<TransactionSuccessfulThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.transactionSuccessfulThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TRANSACTION_SUCCESSFUL_THREE_DIALOG"

  }
}
