package com.opemiposapplication.app.modules.supportmessages.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivitySupportMessagesBinding
import com.opemiposapplication.app.modules.supportmessages.`data`.viewmodel.SupportMessagesVM
import kotlin.String
import kotlin.Unit

class SupportMessagesActivity :
    BaseActivity<ActivitySupportMessagesBinding>(R.layout.activity_support_messages) {
  private val viewModel: SupportMessagesVM by viewModels<SupportMessagesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.supportMessagesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SUPPORT_MESSAGES_ACTIVITY"

  }
}
