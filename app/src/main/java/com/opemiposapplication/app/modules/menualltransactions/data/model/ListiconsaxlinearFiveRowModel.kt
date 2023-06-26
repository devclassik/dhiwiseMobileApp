package com.opemiposapplication.app.modules.menualltransactions.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListiconsaxlinearFiveRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPOSPhonePay: String? = MyApp.getInstance().resources.getString(R.string.msg_pos_phone_pay)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeSix: String? = MyApp.getInstance().resources.getString(R.string.msg_02_12_2022_at_3)

)
