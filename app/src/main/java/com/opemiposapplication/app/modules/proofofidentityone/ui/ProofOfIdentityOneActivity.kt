package com.opemiposapplication.app.modules.proofofidentityone.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityProofOfIdentityOneBinding
import com.opemiposapplication.app.modules.proofofidentityone.`data`.viewmodel.ProofOfIdentityOneVM
import kotlin.String
import kotlin.Unit

class ProofOfIdentityOneActivity :
    BaseActivity<ActivityProofOfIdentityOneBinding>(R.layout.activity_proof_of_identity_one) {
  private val viewModel: ProofOfIdentityOneVM by viewModels<ProofOfIdentityOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.proofOfIdentityOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PROOF_OF_IDENTITY_ONE_ACTIVITY"

  }
}
