package com.opemiposapplication.app.modules.menutransfers.ui

import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityMenuTransfersBinding
import com.opemiposapplication.app.modules.menutransfers.`data`.viewmodel.MenuTransfersVM
import kotlin.String
import kotlin.Unit

class MenuTransfersActivity :
    BaseActivity<ActivityMenuTransfersBinding>(R.layout.activity_menu_transfers) {
  private val viewModel: MenuTransfersVM by viewModels<MenuTransfersVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menuTransfersVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MENU_TRANSFERS_ACTIVITY"

  }
}
