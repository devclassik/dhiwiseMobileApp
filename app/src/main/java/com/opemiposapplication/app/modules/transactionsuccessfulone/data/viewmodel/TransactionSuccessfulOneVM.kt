package com.opemiposapplication.app.modules.transactionsuccessfulone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.transactionsuccessfulone.`data`.model.TransactionSuccessfulOneModel
import org.koin.core.KoinComponent

class TransactionSuccessfulOneVM : ViewModel(), KoinComponent {
  val transactionSuccessfulOneModel: MutableLiveData<TransactionSuccessfulOneModel> =
      MutableLiveData(TransactionSuccessfulOneModel())

  var navArguments: Bundle? = null
}
