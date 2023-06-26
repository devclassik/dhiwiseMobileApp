package com.opemiposapplication.app.modules.transactionsuccessful.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.transactionsuccessful.`data`.model.TransactionSuccessfulModel
import org.koin.core.KoinComponent

class TransactionSuccessfulVM : ViewModel(), KoinComponent {
  val transactionSuccessfulModel: MutableLiveData<TransactionSuccessfulModel> =
      MutableLiveData(TransactionSuccessfulModel())

  var navArguments: Bundle? = null
}
