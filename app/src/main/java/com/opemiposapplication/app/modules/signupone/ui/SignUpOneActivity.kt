package com.opemiposapplication.app.modules.signupone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivitySignUpOneBinding
import com.opemiposapplication.app.modules.signupone.`data`.model.SpinnerGroup903Model
import com.opemiposapplication.app.modules.signupone.`data`.viewmodel.SignUpOneVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class SignUpOneActivity : BaseActivity<ActivitySignUpOneBinding>(R.layout.activity_sign_up_one) {
  private val viewModel: SignUpOneVM by viewModels<SignUpOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroup903List.value = mutableListOf(
    SpinnerGroup903Model("Item1"),
    SpinnerGroup903Model("Item2"),
    SpinnerGroup903Model("Item3"),
    SpinnerGroup903Model("Item4"),
    SpinnerGroup903Model("Item5")
    )
    val spinnerGroup903Adapter =
    SpinnerGroup903Adapter(this,R.layout.spinner_item,viewModel.spinnerGroup903List.value?:
    mutableListOf())
    binding.spinnerGroup903.adapter = spinnerGroup903Adapter
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


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, SignUpOneActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
