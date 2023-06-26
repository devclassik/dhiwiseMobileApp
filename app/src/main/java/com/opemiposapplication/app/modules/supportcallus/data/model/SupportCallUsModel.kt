package com.opemiposapplication.app.modules.supportcallus.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SupportCallUsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGiveusacall: String? = MyApp.getInstance().resources.getString(R.string.msg_give_us_a_call)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt23400000000: String? = MyApp.getInstance().resources.getString(R.string.msg_234_000_0000_0)

)
