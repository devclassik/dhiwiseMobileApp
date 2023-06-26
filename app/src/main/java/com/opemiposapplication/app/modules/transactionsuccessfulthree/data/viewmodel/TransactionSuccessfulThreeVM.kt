package com.opemiposapplication.app.modules.transactionsuccessfulthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.transactionsuccessfulthree.`data`.model.TransactionSuccessfulThreeModel
import org.koin.core.KoinComponent

class TransactionSuccessfulThreeVM : ViewModel(), KoinComponent {
  val transactionSuccessfulThreeModel: MutableLiveData<TransactionSuccessfulThreeModel> =
      MutableLiveData(TransactionSuccessfulThreeModel())

  var navArguments: Bundle? = null
}
