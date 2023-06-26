package com.opemiposapplication.app.modules.proofofidentityone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.opemiposapplication.app.modules.proofofidentityone.`data`.model.ProofOfIdentityOneModel
import org.koin.core.KoinComponent

class ProofOfIdentityOneVM : ViewModel(), KoinComponent {
  val proofOfIdentityOneModel: MutableLiveData<ProofOfIdentityOneModel> =
      MutableLiveData(ProofOfIdentityOneModel())

  var navArguments: Bundle? = null
}
