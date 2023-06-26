package com.opemiposapplication.app.modules.settingsposterminalfeatures.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListardownRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWithdrawal: String? = MyApp.getInstance().resources.getString(R.string.lbl_withdrawal)

)
