package com.opemiposapplication.app.modules.bankinformation.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BankInformationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBankInformatio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bank_informatio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContinuewithy: String? =
      MyApp.getInstance().resources.getString(R.string.msg_continue_with_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFourValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTenValue: String? = null
)
