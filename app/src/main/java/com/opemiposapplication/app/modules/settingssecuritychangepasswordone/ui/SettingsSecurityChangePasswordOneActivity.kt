package com.opemiposapplication.app.modules.settingssecuritychangepasswordone.ui

import android.view.View
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivitySettingsSecurityChangePasswordOneBinding
import com.opemiposapplication.app.modules.settingssecuritychangepasswordone.`data`.model.ListoneRowModel
import com.opemiposapplication.app.modules.settingssecuritychangepasswordone.`data`.viewmodel.SettingsSecurityChangePasswordOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SettingsSecurityChangePasswordOneActivity :
    BaseActivity<ActivitySettingsSecurityChangePasswordOneBinding>(R.layout.activity_settings_security_change_password_one)
    {
  private val viewModel: SettingsSecurityChangePasswordOneVM by
      viewModels<SettingsSecurityChangePasswordOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listoneAdapter = ListoneAdapter(viewModel.listoneList.value?:mutableListOf())
    binding.recyclerListone.adapter = listoneAdapter
    listoneAdapter.setOnItemClickListener(
    object : ListoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListoneRowModel) {
        onClickRecyclerListone(view, position, item)
      }
    }
    )
    viewModel.listoneList.observe(this) {
      listoneAdapter.updateData(it)
    }
    binding.settingsSecurityChangePasswordOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListone(
    view: View,
    position: Int,
    item: ListoneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SETTINGS_SECURITY_CHANGE_PASSWORD_ONE_ACTIVITY"

  }
}
