package com.opemiposapplication.app.modules.otplogin.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OtpLoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoginwithOTP: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_login_with_otp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_enter_th2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOTPexpiresin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_otp_expires_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSeventeen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_didn_t_receive)

)
