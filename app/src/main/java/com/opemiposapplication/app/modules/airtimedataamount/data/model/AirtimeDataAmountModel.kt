package com.opemiposapplication.app.modules.airtimedataamount.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AirtimeDataAmountModel(
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
  var txtOWNYOURWEIRDOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_data)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteranAccoun: String? = MyApp.getInstance().resources.getString(R.string.lbl_amount)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipien: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_data_pac)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipienOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_how_much_airtim)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransferFrom: String? = MyApp.getInstance().resources.getString(R.string.lbl_data_from)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup1562: String? = MyApp.getInstance().resources.getString(R.string.lbl_bc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOWNYOURWEIRDTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_own_your_weird)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_acct_no_00112)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChange: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etNCounterValue: String? = null
)
