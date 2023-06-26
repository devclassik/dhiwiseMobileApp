package com.opemiposapplication.app.modules.supportcontactus.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SupportContactUsModel(
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
  var txtOWNYOURWEIRDOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_support)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteranAccoun: String? = MyApp.getInstance().resources.getString(R.string.lbl_contact_us2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipien: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_chat_with_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipienOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_send_us_an_emai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipienTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_call_us)

)
