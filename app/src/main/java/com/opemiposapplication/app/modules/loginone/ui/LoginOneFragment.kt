package com.opemiposapplication.app.modules.loginone.ui

import androidx.appcompat.widget.SearchView
import androidx.fragment.app.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseFragment
import com.opemiposapplication.app.databinding.FragmentLoginOneBinding
import com.opemiposapplication.app.modules.loginone.`data`.model.SpinnerGroup113Model
import com.opemiposapplication.app.modules.loginone.`data`.viewmodel.LoginOneVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class LoginOneFragment : BaseFragment<FragmentLoginOneBinding>(R.layout.fragment_login_one) {
  private val viewModel: LoginOneVM by viewModels<LoginOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    viewModel.spinnerGroup113List.value = mutableListOf(
    SpinnerGroup113Model("Item1"),
    SpinnerGroup113Model("Item2"),
    SpinnerGroup113Model("Item3"),
    SpinnerGroup113Model("Item4"),
    SpinnerGroup113Model("Item5")
    )
    val spinnerGroup113Adapter =
    SpinnerGroup113Adapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerGroup113List.value?:
    mutableListOf())
    binding.spinnerGroup113.adapter = spinnerGroup113Adapter
    binding.loginOneVM = viewModel
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
      const val TAG: String = "LOGIN_ONE_FRAGMENT"

    }
  }
