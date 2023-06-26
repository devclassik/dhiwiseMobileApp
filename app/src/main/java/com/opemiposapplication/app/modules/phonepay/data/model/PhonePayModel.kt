package com.opemiposapplication.app.modules.phonepay.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PhonePayModel(
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
  var txtOWNYOURWEIRDOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_phone_pay)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteranAccoun: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNext: String? = MyApp.getInstance().resources.getString(R.string.lbl_next)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNextOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_next)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipien: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipienOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_purpose)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipienTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_description)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_50)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup1669Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup1669TwoValue: String? = null
)
