package com.opemiposapplication.app.modules.transactionsuccessfultwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.transactionsuccessfultwo.`data`.model.TransactionSuccessfulTwoModel
import org.koin.core.KoinComponent

class TransactionSuccessfulTwoVM : ViewModel(), KoinComponent {
  val transactionSuccessfulTwoModel: MutableLiveData<TransactionSuccessfulTwoModel> =
      MutableLiveData(TransactionSuccessfulTwoModel())

  var navArguments: Bundle? = null
}
