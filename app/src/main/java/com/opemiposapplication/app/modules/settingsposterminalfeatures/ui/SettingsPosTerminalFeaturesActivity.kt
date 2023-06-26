package com.opemiposapplication.app.modules.settingsposterminalfeatures.ui

import android.view.View
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivitySettingsPosTerminalFeaturesBinding
import com.opemiposapplication.app.modules.settingsposterminalfeatures.`data`.model.ListardownRowModel
import com.opemiposapplication.app.modules.settingsposterminalfeatures.`data`.viewmodel.SettingsPosTerminalFeaturesVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SettingsPosTerminalFeaturesActivity :
    BaseActivity<ActivitySettingsPosTerminalFeaturesBinding>(R.layout.activity_settings_pos_terminal_features)
    {
  private val viewModel: SettingsPosTerminalFeaturesVM by
      viewModels<SettingsPosTerminalFeaturesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listarrowdownAdapter =
    ListarrowdownAdapter(viewModel.listarrowdownList.value?:mutableListOf())
    binding.recyclerListarrowdown.adapter = listarrowdownAdapter
    listarrowdownAdapter.setOnItemClickListener(
    object : ListarrowdownAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListardownRowModel) {
        onClickRecyclerListarrowdown(view, position, item)
      }
    }
    )
    viewModel.listarrowdownList.observe(this) {
      listarrowdownAdapter.updateData(it)
    }
    binding.settingsPosTerminalFeaturesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListarrowdown(
    view: View,
    position: Int,
    item: ListardownRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SETTINGS_POS_TERMINAL_FEATURES_ACTIVITY"

  }
}
