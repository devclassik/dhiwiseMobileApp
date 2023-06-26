package com.opemiposapplication.app.modules.bankinformation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.bankinformation.`data`.model.BankInformationModel
import com.opemiposapplication.app.modules.bankinformation.`data`.model.SpinnerGroupFiveModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class BankInformationVM : ViewModel(), KoinComponent {
  val bankInformationModel: MutableLiveData<BankInformationModel> =
      MutableLiveData(BankInformationModel())

  var navArguments: Bundle? = null

  val spinnerGroupFiveList: MutableLiveData<MutableList<SpinnerGroupFiveModel>> = MutableLiveData()
}
