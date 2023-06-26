package com.opemiposapplication.app.modules.transferone.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TransferOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOWNYOURWEIRD: String? = MyApp.getInstance().resources.getString(R.string.lbl_transfer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteranAccoun: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_an_accoun)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipien: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_receipien)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipienOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recipient_s_ban)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectBenefici: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_benefici)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup1562: String? = MyApp.getInstance().resources.getString(R.string.lbl_bc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_bright_cyph)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZenithBankZero: String? =
      MyApp.getInstance().resources.getString(R.string.msg_zenith_bank_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZenithBankZeroOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_view_all_benefi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOWNYOURWEIRDOne: String? =
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
  var etGroup1669Value: String? = null
)
