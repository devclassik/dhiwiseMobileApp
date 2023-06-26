package com.opemiposapplication.app.modules.settings.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SettingsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOWNYOURWEIRD: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_beetle_taxi_inc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAcctNo001122: String? =
      MyApp.getInstance().resources.getString(R.string.msg_acct_no_001122)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOWNYOURWEIRDOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipien: String? =
      MyApp.getInstance().resources.getString(R.string.msg_personal_inform)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipienOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_account_informa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipienTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_security)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipienThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_devices)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipienFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_configuration_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipienFive: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_language)

)
