package com.opemiposapplication.app.modules.enterbvn.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.appcomponents.views.DatePickerFragment
import com.opemiposapplication.app.databinding.ActivityEnterBvnBinding
import com.opemiposapplication.app.modules.bankinformation.ui.BankInformationActivity
import com.opemiposapplication.app.modules.enterbvn.`data`.viewmodel.EnterBvnVM
import java.util.Date
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EnterBvnActivity : BaseActivity<ActivityEnterBvnBinding>(R.layout.activity_enter_bvn) {
  private val viewModel: EnterBvnVM by viewModels<EnterBvnVM>()

  private val REQUEST_CODE_BANK_INFORMATION_ACTIVITY: Int = 526

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.enterBvnVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowdateofbirth.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
          selectedDate ->
        onDateSelectedLinearRowdateofbirth(selectedDate)
      }
    }
    binding.btnNext.setOnClickListener {
      val destIntent = BankInformationActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_BANK_INFORMATION_ACTIVITY)
    }
  }

  private fun onDateSelectedLinearRowdateofbirth(selectedDate: Date) {
  }

  companion object {
    const val TAG: String = "ENTER_BVN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EnterBvnActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
