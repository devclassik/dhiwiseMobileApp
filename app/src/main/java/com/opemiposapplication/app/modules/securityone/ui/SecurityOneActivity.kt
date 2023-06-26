package com.opemiposapplication.app.modules.securityone.ui

import android.view.View
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivitySecurityOneBinding
import com.opemiposapplication.app.modules.securityone.`data`.model.SecurityOneRowModel
import com.opemiposapplication.app.modules.securityone.`data`.viewmodel.SecurityOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SecurityOneActivity : BaseActivity<ActivitySecurityOneBinding>(R.layout.activity_security_one)
    {
  private val viewModel: SecurityOneVM by viewModels<SecurityOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val securityOneAdapter =
    SecurityOneAdapter(viewModel.securityOneList.value?:mutableListOf())
    binding.recyclerSecurityOne.adapter = securityOneAdapter
    securityOneAdapter.setOnItemClickListener(
    object : SecurityOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SecurityOneRowModel) {
        onClickRecyclerSecurityOne(view, position, item)
      }
    }
    )
    viewModel.securityOneList.observe(this) {
      securityOneAdapter.updateData(it)
    }
    binding.securityOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerSecurityOne(
    view: View,
    position: Int,
    item: SecurityOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SECURITY_ONE_ACTIVITY"

  }
}
