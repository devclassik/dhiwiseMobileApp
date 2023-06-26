package com.opemiposapplication.app.modules.menualltransactions.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Listmaximize4RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDebitTransfe: String? = MyApp.getInstance().resources.getString(R.string.msg_debit_transfe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_02_12_2022_at_3)

)
