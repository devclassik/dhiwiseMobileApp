package com.opemiposapplication.app.modules.otp.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OtpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVerifyDetails: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_verify_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleaseenterth: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_enter_th)
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
