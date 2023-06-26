package com.opemiposapplication.app.modules.signuptwo.ui

import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivitySignUpTwoBinding
import com.opemiposapplication.app.modules.signuptwo.`data`.viewmodel.SignUpTwoVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class SignUpTwoActivity : BaseActivity<ActivitySignUpTwoBinding>(R.layout.activity_sign_up_two) {
  private val viewModel: SignUpTwoVM by viewModels<SignUpTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpTwoVM = viewModel
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
      const val TAG: String = "SIGN_UP_TWO_ACTIVITY"

    }
  }
