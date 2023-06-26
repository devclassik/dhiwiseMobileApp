package com.opemiposapplication.app.modules.security.ui

import android.view.View
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivitySecurityBinding
import com.opemiposapplication.app.modules.security.`data`.model.SecurityRowModel
import com.opemiposapplication.app.modules.security.`data`.viewmodel.SecurityVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SecurityActivity : BaseActivity<ActivitySecurityBinding>(R.layout.activity_security) {
  private val viewModel: SecurityVM by viewModels<SecurityVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val securityAdapter = SecurityAdapter(viewModel.securityList.value?:mutableListOf())
    binding.recyclerSecurity.adapter = securityAdapter
    securityAdapter.setOnItemClickListener(
    object : SecurityAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SecurityRowModel) {
        onClickRecyclerSecurity(view, position, item)
      }
    }
    )
    viewModel.securityList.observe(this) {
      securityAdapter.updateData(it)
    }
    binding.securityVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerSecurity(
    view: View,
    position: Int,
    item: SecurityRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SECURITY_ACTIVITY"

  }
}
