package com.opemiposapplication.app.modules.enterbvn.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EnterBvnModel(
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
  var txtEnteryourBVN: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_enter_your_bvn)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_enter_yo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateofBirth: String? = MyApp.getInstance().resources.getString(R.string.lbl_date_of_birth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleaseinput: String? = MyApp.getInstance().resources.getString(R.string.msg_please_input)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dial_565_0_on)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFourValue: String? = null
)
