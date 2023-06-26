package com.opemiposapplication.app.modules.posterminaldetails.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PosTerminalDetailsModel(
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
  var txtOWNYOURWEIRDOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_pos_terminal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteranAccoun: String? = MyApp.getInstance().resources.getString(R.string.lbl_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_terminal_id_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeTerminal: String? =
      MyApp.getInstance().resources.getString(R.string.msg_change_terminal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWithdrawalAuth: String? =
      MyApp.getInstance().resources.getString(R.string.msg_withdrawal_auth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReceiptCOnfigu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_receipt_configu)

)
