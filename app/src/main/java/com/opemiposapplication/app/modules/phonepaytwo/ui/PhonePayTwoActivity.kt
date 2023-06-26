package com.opemiposapplication.app.modules.phonepaytwo.ui

import android.view.View
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityPhonePayTwoBinding
import com.opemiposapplication.app.modules.phonepaytwo.`data`.model.PhonePayTwoRowModel
import com.opemiposapplication.app.modules.phonepaytwo.`data`.model.SpinnerGroup911Model
import com.opemiposapplication.app.modules.phonepaytwo.`data`.viewmodel.PhonePayTwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PhonePayTwoActivity :
    BaseActivity<ActivityPhonePayTwoBinding>(R.layout.activity_phone_pay_two) {
  private val viewModel: PhonePayTwoVM by viewModels<PhonePayTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroup911List.value = mutableListOf(
    SpinnerGroup911Model("Item1"),
    SpinnerGroup911Model("Item2"),
    SpinnerGroup911Model("Item3"),
    SpinnerGroup911Model("Item4"),
    SpinnerGroup911Model("Item5")
    )
    val spinnerGroup911Adapter =
    SpinnerGroup911Adapter(this,R.layout.spinner_item,viewModel.spinnerGroup911List.value?:
    mutableListOf())
    binding.spinnerGroup911.adapter = spinnerGroup911Adapter
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
