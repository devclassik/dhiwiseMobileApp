package com.opemiposapplication.app.modules.login1.ui

import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityLogin1Binding
import com.opemiposapplication.app.modules.login1.`data`.viewmodel.Login1VM
import kotlin.String
import kotlin.Unit

class Login1Activity : BaseActivity<ActivityLogin1Binding>(R.layout.activity_login1) {
  private val viewModel: Login1VM by viewModels<Login1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.login1VM = viewModel
    val adapter = Login1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerViewpager.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup22,binding.viewPagerViewpager) { tab, position ->
      tab.text = Login1ActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "LOGIN1ACTIVITY"

    }
  }
