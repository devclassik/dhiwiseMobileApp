package com.opemiposapplication.app.modules.alltransactionsairtimedata.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListiconsaxlinearOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAirtimetoMTN: String? =
      MyApp.getInstance().resources.getString(R.string.msg_airtime_to_mtn)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_02_12_2022_at_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtN500000: String? = MyApp.getInstance().resources.getString(R.string.lbl_n5_000_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeclined: String? = MyApp.getInstance().resources.getString(R.string.lbl_declined)

)
