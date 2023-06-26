package com.opemiposapplication.app.modules.signupone.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateAccount: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_create_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProvideyourem: String? =
      MyApp.getInstance().resources.getString(R.string.msg_provide_your_em)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhoneNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_phone_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUseemailaddre: String? =
      MyApp.getInstance().resources.getString(R.string.msg_use_email_addre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)

)
