package com.opemiposapplication.app.modules.signupone.ui

import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivitySignUpOneBinding
import com.opemiposapplication.app.modules.signupone.`data`.model.SpinnerGroup109Model
import com.opemiposapplication.app.modules.signupone.`data`.viewmodel.SignUpOneVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class SignUpOneActivity : BaseActivity<ActivitySignUpOneBinding>(R.layout.activity_sign_up_one) {
  private val viewModel: SignUpOneVM by viewModels<SignUpOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroup109List.value = mutableListOf(
    SpinnerGroup109Model("Item1"),
    SpinnerGroup109Model("Item2"),
    SpinnerGroup109Model("Item3"),
    SpinnerGroup109Model("Item4"),
    SpinnerGroup109Model("Item5")
    )
    val spinnerGroup109Adapter =
    SpinnerGroup109Adapter(this,R.layout.spinner_item,viewModel.spinnerGroup109List.value?:
    mutableListOf())
    binding.spinnerGroup109.adapter = spinnerGroup109Adapter
    binding.signUpOneVM = viewModel
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
      const val TAG: String = "SIGN_UP_ONE_ACTIVITY"

    }
  }
