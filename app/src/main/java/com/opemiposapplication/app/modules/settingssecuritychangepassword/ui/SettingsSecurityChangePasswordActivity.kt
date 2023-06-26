package com.opemiposapplication.app.modules.settingssecuritychangepassword.ui

import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivitySettingsSecurityChangePasswordBinding
import com.opemiposapplication.app.modules.settingssecuritychangepassword.`data`.viewmodel.SettingsSecurityChangePasswordVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class SettingsSecurityChangePasswordActivity :
    BaseActivity<ActivitySettingsSecurityChangePasswordBinding>(R.layout.activity_settings_security_change_password)
    {
  private val viewModel: SettingsSecurityChangePasswordVM by
      viewModels<SettingsSecurityChangePasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.settingsSecurityChangePasswordVM = viewModel
    setUpSearchViewGroupElevenListener()
    setUpSearchViewGroupTwelveListener()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  private fun setUpSearchViewGroupElevenListener(): Unit {
    binding.searchViewGroupEleven.setOnQueryTextListener(object :
    SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    private fun setUpSearchViewGroupTwelveListener(): Unit {
      binding.searchViewGroupTwelve.setOnQueryTextListener(object :
      SearchView.OnQueryTextListener {
        override fun onQueryTextSubmit(p0 : String) : Boolean {
          // Performs search when user hit
          // the search button on the keyboard
          return false
        }
        override fun onQueryTextChange(p0 : String) : Boolean {
          // Start filtering the list as user
          // start entering the characters
          return false
        }
        })
      }

      companion object {
        const val TAG: String = "SETTINGS_SECURITY_CHANGE_PASSWORD_ACTIVITY"

      }
    }
