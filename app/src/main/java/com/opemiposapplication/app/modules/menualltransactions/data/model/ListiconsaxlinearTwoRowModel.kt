package com.opemiposapplication.app.modules.menualltransactions.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListiconsaxlinearTwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPOSCardTran: String? = MyApp.getInstance().resources.getString(R.string.msg_pos_card_tran)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeThree: String? = MyApp.getInstance().resources.getString(R.string.msg_02_12_2022_at_3)

)
