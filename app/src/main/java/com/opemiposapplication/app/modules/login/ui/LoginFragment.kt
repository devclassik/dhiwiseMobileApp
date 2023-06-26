package com.opemiposapplication.app.modules.login.ui

import androidx.appcompat.widget.SearchView
import androidx.fragment.app.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseFragment
import com.opemiposapplication.app.databinding.FragmentLoginBinding
import com.opemiposapplication.app.modules.login.`data`.viewmodel.LoginVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class LoginFragment : BaseFragment<FragmentLoginBinding>(R.layout.fragment_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.loginVM = viewModel
    setUpSearchViewGroupElevenListener()
  }

  override fun setUpClicks(): Unit {
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

    companion object {
      const val TAG: String = "LOGIN_FRAGMENT"

    }
  }
