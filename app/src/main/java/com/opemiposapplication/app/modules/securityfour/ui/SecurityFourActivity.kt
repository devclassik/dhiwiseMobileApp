package com.opemiposapplication.app.modules.securityfour.ui

import android.view.View
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivitySecurityFourBinding
import com.opemiposapplication.app.modules.securityfour.`data`.model.SecurityFourRowModel
import com.opemiposapplication.app.modules.securityfour.`data`.viewmodel.SecurityFourVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SecurityFourActivity :
    BaseActivity<ActivitySecurityFourBinding>(R.layout.activity_security_four) {
  private val viewModel: SecurityFourVM by viewModels<SecurityFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val securityFourAdapter =
    SecurityFourAdapter(viewModel.securityFourList.value?:mutableListOf())
    binding.recyclerSecurityFour.adapter = securityFourAdapter
    securityFourAdapter.setOnItemClickListener(
    object : SecurityFourAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SecurityFourRowModel) {
        onClickRecyclerSecurityFour(view, position, item)
      }
    }
    )
    viewModel.securityFourList.observe(this) {
      securityFourAdapter.updateData(it)
    }
    binding.securityFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerSecurityFour(
    view: View,
    position: Int,
    item: SecurityFourRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SECURITY_FOUR_ACTIVITY"

  }
}
