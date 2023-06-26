package com.opemiposapplication.app.modules.signuptwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivitySignUpTwoBinding
import com.opemiposapplication.app.modules.signupone.ui.SignUpOneActivity
import com.opemiposapplication.app.modules.signuptwo.`data`.viewmodel.SignUpTwoVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SignUpTwoActivity : BaseActivity<ActivitySignUpTwoBinding>(R.layout.activity_sign_up_two) {
  private val viewModel: SignUpTwoVM by viewModels<SignUpTwoVM>()

  private val REQUEST_CODE_SIGN_UP_ONE_ACTIVITY: Int = 743


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpTwoVM = viewModel
    setUpSearchViewGroupElevenListener()
  }

  override fun setUpClicks(): Unit {
    binding.btnNext.setOnClickListener {
      val destIntent = SignUpOneActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SIGN_UP_ONE_ACTIVITY)
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

    companion object {
      const val TAG: String = "SIGN_UP_TWO_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, SignUpTwoActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
