package com.opemiposapplication.app.modules.personalinformation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.personalinformation.`data`.model.PersonalInformationModel
import com.opemiposapplication.app.modules.personalinformation.`data`.model.SpinnerGroup905Model
import com.opemiposapplication.app.modules.personalinformation.`data`.model.SpinnerGroupTwentyModel
import com.opemiposapplication.app.modules.personalinformation.`data`.model.SpinnerGroupTwentyThreeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PersonalInformationVM : ViewModel(), KoinComponent {
  val personalInformationModel: MutableLiveData<PersonalInformationModel> =
      MutableLiveData(PersonalInformationModel())

  var navArguments: Bundle? = null

  val spinnerGroupTwentyList: MutableLiveData<MutableList<SpinnerGroupTwentyModel>> =
      MutableLiveData()

  val spinnerGroupTwentyThreeList: MutableLiveData<MutableList<SpinnerGroupTwentyThreeModel>> =
      MutableLiveData()

  val spinnerGroup905List: MutableLiveData<MutableList<SpinnerGroup905Model>> = MutableLiveData()
}
