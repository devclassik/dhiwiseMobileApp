package com.opemiposapplication.app.modules.alltransactionsbillpayment.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListiconsaxlinearOne1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDSTVCable: String? = MyApp.getInstance().resources.getString(R.string.lbl_dstv_cable)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_02_12_2022_at_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtN980000: String? = MyApp.getInstance().resources.getString(R.string.lbl_n9_800_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSuccessful: String? = MyApp.getInstance().resources.getString(R.string.lbl_successful)

)
