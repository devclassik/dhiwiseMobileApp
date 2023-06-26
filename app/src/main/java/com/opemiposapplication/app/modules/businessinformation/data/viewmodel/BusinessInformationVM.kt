package com.opemiposapplication.app.modules.businessinformation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.businessinformation.`data`.model.BusinessInformationModel
import com.opemiposapplication.app.modules.businessinformation.`data`.model.SpinnerGroupFiveModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class BusinessInformationVM : ViewModel(), KoinComponent {
  val businessInformationModel: MutableLiveData<BusinessInformationModel> =
      MutableLiveData(BusinessInformationModel())

  var navArguments: Bundle? = null

  val spinnerGroupFiveList: MutableLiveData<MutableList<SpinnerGroupFiveModel>> = MutableLiveData()
}
