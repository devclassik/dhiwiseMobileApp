package com.opemiposapplication.app.modules.phonepaytwo.ui

import android.view.View
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityPhonePayTwoBinding
import com.opemiposapplication.app.modules.phonepaytwo.`data`.model.PhonePayTwoRowModel
import com.opemiposapplication.app.modules.phonepaytwo.`data`.model.SpinnerGroup117Model
import com.opemiposapplication.app.modules.phonepaytwo.`data`.viewmodel.PhonePayTwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PhonePayTwoActivity :
    BaseActivity<ActivityPhonePayTwoBinding>(R.layout.activity_phone_pay_two) {
  private val viewModel: PhonePayTwoVM by viewModels<PhonePayTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroup117List.value = mutableListOf(
    SpinnerGroup117Model("Item1"),
    SpinnerGroup117Model("Item2"),
    SpinnerGroup117Model("Item3"),
    SpinnerGroup117Model("Item4"),
    SpinnerGroup117Model("Item5")
    )
    val spinnerGroup117Adapter =
    SpinnerGroup117Adapter(this,R.layout.spinner_item,viewModel.spinnerGroup117List.value?:
    mutableListOf())
    binding.spinnerGroup117.adapter = spinnerGroup117Adapter
    val phonePayTwoAdapter =
    PhonePayTwoAdapter(viewModel.phonePayTwoList.value?:mutableListOf())
    binding.recyclerPhonePayTwo.adapter = phonePayTwoAdapter
    phonePayTwoAdapter.setOnItemClickListener(
    object : PhonePayTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PhonePayTwoRowModel) {
        onClickRecyclerPhonePayTwo(view, position, item)
      }
    }
    )
    viewModel.phonePayTwoList.observe(this) {
      phonePayTwoAdapter.updateData(it)
    }
    binding.phonePayTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerPhonePayTwo(
    view: View,
    position: Int,
    item: PhonePayTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PHONE_PAY_TWO_ACTIVITY"

  }
}
