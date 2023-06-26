package com.opemiposapplication.app.modules.supportchatwithus.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivitySupportChatWithUsBinding
import com.opemiposapplication.app.modules.supportchatwithus.`data`.viewmodel.SupportChatWithUsVM
import kotlin.String
import kotlin.Unit

class SupportChatWithUsActivity :
    BaseActivity<ActivitySupportChatWithUsBinding>(R.layout.activity_support_chat_with_us) {
  private val viewModel: SupportChatWithUsVM by viewModels<SupportChatWithUsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.supportChatWithUsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SUPPORT_CHAT_WITH_US_ACTIVITY"

  }
}
