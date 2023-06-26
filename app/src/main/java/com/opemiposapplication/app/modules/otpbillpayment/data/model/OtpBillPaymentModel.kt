package com.opemiposapplication.app.modules.otpbillpayment.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OtpBillPaymentModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVerifyTransact: String? =
      MyApp.getInstance().resources.getString(R.string.msg_verify_transact)
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
