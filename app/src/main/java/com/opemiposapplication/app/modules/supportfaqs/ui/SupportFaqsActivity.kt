package com.opemiposapplication.app.modules.supportfaqs.ui

import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivitySupportFaqsBinding
import com.opemiposapplication.app.modules.supportfaqs.`data`.viewmodel.SupportFaqsVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class SupportFaqsActivity : BaseActivity<ActivitySupportFaqsBinding>(R.layout.activity_support_faqs)
    {
  private val viewModel: SupportFaqsVM by viewModels<SupportFaqsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.supportFaqsVM = viewModel
    setUpSearchViewGroup1703Listener()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  private fun setUpSearchViewGroup1703Listener(): Unit {
    binding.searchViewGroup1703.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
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
      const val TAG: String = "SUPPORT_FAQS_ACTIVITY"

    }
  }
