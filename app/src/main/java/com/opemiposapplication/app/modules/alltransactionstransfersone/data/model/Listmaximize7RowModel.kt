package com.opemiposapplication.app.modules.alltransactionstransfersone.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Listmaximize7RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCreditTransf: String? = MyApp.getInstance().resources.getString(R.string.msg_credit_transf)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_02_12_2022_at_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtN2500000: String? = MyApp.getInstance().resources.getString(R.string.lbl_n25_000_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPending: String? = MyApp.getInstance().resources.getString(R.string.lbl_pending)

)
