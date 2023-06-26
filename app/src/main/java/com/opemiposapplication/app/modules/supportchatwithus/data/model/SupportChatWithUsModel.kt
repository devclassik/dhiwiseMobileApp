package com.opemiposapplication.app.modules.supportchatwithus.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SupportChatWithUsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOWNYOURWEIRD: String? = MyApp.getInstance().resources.getString(R.string.lbl_chat_with_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_12_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHuiosPaySuppor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_huiospay_suppor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_hi_there_thank)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterAccountN: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_if_the_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup1695Value: String? = null
)
