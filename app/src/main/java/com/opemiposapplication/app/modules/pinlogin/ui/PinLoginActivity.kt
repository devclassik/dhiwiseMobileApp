package com.opemiposapplication.app.modules.pinlogin.ui

import android.view.View
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityPinLoginBinding
import com.opemiposapplication.app.modules.pinlogin.`data`.model.PinLoginRowModel
import com.opemiposapplication.app.modules.pinlogin.`data`.viewmodel.PinLoginVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PinLoginActivity : BaseActivity<ActivityPinLoginBinding>(R.layout.activity_pin_login) {
  private val viewModel: PinLoginVM by viewModels<PinLoginVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val pinLoginAdapter = PinLoginAdapter(viewModel.pinLoginList.value?:mutableListOf())
    binding.recyclerPinLogin.adapter = pinLoginAdapter
    pinLoginAdapter.setOnItemClickListener(
    object : PinLoginAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PinLoginRowModel) {
        onClickRecyclerPinLogin(view, position, item)
      }
    }
    )
    viewModel.pinLoginList.observe(this) {
      pinLoginAdapter.updateData(it)
    }
    binding.pinLoginVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerPinLogin(
    view: View,
    position: Int,
    item: PinLoginRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PIN_LOGIN_ACTIVITY"

  }
}
