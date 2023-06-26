package com.opemiposapplication.app.modules.businessinformation.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BusinessInformationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBusinessInform: String? =
      MyApp.getInstance().resources.getString(R.string.msg_business_inform)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputyourbusi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_input_your_busi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFourValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupElevenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupNineteenValue: String? = null
)
