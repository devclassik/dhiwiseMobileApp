package com.opemiposapplication.app.modules.settingspersonalinformation.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SettingsPersonalInformationModel(
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
      MyApp.getInstance().resources.getString(R.string.msg_personal_inform)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateofBirth: String? = MyApp.getInstance().resources.getString(R.string.lbl_date_of_birth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteranAccounOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_next_of_kin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateofBirthOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_date_of_birth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddressLineOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_address_line)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLGA: String? = MyApp.getInstance().resources.getString(R.string.lbl_l_g_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCityOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_city)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtState: String? = MyApp.getInstance().resources.getString(R.string.lbl_state)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup1687Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup1688Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup1689Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup1690Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup1686Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup1691Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup1687OneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup1688OneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup1690OneValue: String? = null
)
