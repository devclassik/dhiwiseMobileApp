package com.opemiposapplication.app.modules.settingsaccountinformation.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SettingsAccountInformationModel(
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
  var txtEnteranAccoun: String? =
      MyApp.getInstance().resources.getString(R.string.msg_account_informa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateofBirth: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_account_opening)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup1687Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup1689Value: String? = null
)
