package com.opemiposapplication.app.modules.otpsuccessful.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OtpSuccessfulModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVerificationSu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_verification_su)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProceedtobusi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_proceed_to_busi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTermAndCondition: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_clicking_the)

)
