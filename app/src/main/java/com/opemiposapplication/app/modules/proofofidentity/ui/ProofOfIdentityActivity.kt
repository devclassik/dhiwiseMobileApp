package com.opemiposapplication.app.modules.proofofidentity.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityProofOfIdentityBinding
import com.opemiposapplication.app.modules.proofofidentity.`data`.viewmodel.ProofOfIdentityVM
import kotlin.String
import kotlin.Unit

class ProofOfIdentityActivity :
    BaseActivity<ActivityProofOfIdentityBinding>(R.layout.activity_proof_of_identity) {
  private val viewModel: ProofOfIdentityVM by viewModels<ProofOfIdentityVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.proofOfIdentityVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PROOF_OF_IDENTITY_ACTIVITY"

  }
}
