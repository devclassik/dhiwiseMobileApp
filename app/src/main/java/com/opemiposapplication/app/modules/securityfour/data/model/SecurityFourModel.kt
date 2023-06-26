package com.opemiposapplication.app.modules.securityfour.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SecurityFourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnter4digitP: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_4_digit_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputPINfort: String? =
      MyApp.getInstance().resources.getString(R.string.msg_input_pin_for_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZero: String? = MyApp.getInstance().resources.getString(R.string.lbl_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFifteen: String? = MyApp.getInstance().resources.getString(R.string.lbl2)

)
