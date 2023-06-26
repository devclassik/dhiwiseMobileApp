package com.opemiposapplication.app.modules.securitythree.ui

import android.view.View
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivitySecurityThreeBinding
import com.opemiposapplication.app.modules.securitythree.`data`.model.SecurityThreeRowModel
import com.opemiposapplication.app.modules.securitythree.`data`.viewmodel.SecurityThreeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SecurityThreeActivity :
    BaseActivity<ActivitySecurityThreeBinding>(R.layout.activity_security_three) {
  private val viewModel: SecurityThreeVM by viewModels<SecurityThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val securityThreeAdapter =
    SecurityThreeAdapter(viewModel.securityThreeList.value?:mutableListOf())
    binding.recyclerSecurityThree.adapter = securityThreeAdapter
    securityThreeAdapter.setOnItemClickListener(
    object : SecurityThreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SecurityThreeRowModel) {
        onClickRecyclerSecurityThree(view, position, item)
      }
    }
    )
    viewModel.securityThreeList.observe(this) {
      securityThreeAdapter.updateData(it)
    }
    binding.securityThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerSecurityThree(
    view: View,
    position: Int,
    item: SecurityThreeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SECURITY_THREE_ACTIVITY"

  }
}
