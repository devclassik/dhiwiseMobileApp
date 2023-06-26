package com.opemiposapplication.app.modules.menudashboard.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListmaximizeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTransfertoBri: String? =
      MyApp.getInstance().resources.getString(R.string.msg_transfer_to_bri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_02_12_2022_at_3)

)
