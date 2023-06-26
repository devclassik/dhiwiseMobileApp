package com.opemiposapplication.app.modules.supportmessages.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SupportMessagesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOWNYOURWEIRD: String? = MyApp.getInstance().resources.getString(R.string.lbl_messages)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup1701: String? = MyApp.getInstance().resources.getString(R.string.lbl_h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipien: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hey_huiospay)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipienOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_2dys_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup1701One: String? = MyApp.getInstance().resources.getString(R.string.lbl_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipienTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_i_have_an_issue)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipienThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_4dys_ago)

)
