package com.opemiposapplication.app.modules.supportfaqs.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SupportFaqsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOWNYOURWEIRD: String? = MyApp.getInstance().resources.getString(R.string.lbl_faqs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup1701: String? = MyApp.getInstance().resources.getString(R.string.lbl_g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipien: String? =
      MyApp.getInstance().resources.getString(R.string.msg_getting_started)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup1701One: String? = MyApp.getInstance().resources.getString(R.string.lbl_k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipienOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kyc_account_ver2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup1701Two: String? = MyApp.getInstance().resources.getString(R.string.lbl_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipienTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_about_phone_pay)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup1701Three: String? = MyApp.getInstance().resources.getString(R.string.lbl_h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipienThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_how_to_get_our)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup1701Four: String? = MyApp.getInstance().resources.getString(R.string.lbl_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipienFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_airtime_data)

)
