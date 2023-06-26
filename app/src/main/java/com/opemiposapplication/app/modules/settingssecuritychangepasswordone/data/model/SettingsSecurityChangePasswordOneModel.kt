package com.opemiposapplication.app.modules.settingssecuritychangepasswordone.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SettingsSecurityChangePasswordOneModel(
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
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOWNYOURWEIRDOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteranAccoun: String? = MyApp.getInstance().resources.getString(R.string.lbl_change_pin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputnewPIN: String? = MyApp.getInstance().resources.getString(R.string.lbl_input_new_pin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZero: String? = MyApp.getInstance().resources.getString(R.string.lbl_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSixteen: String? = MyApp.getInstance().resources.getString(R.string.lbl2)

)
