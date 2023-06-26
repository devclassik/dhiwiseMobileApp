package com.opemiposapplication.app.modules.transfer.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TransferModel(
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
  var txtOWNYOURWEIRDOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_transfer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteranAccoun: String? = MyApp.getInstance().resources.getString(R.string.lbl_amount)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSendTo: String? = MyApp.getInstance().resources.getString(R.string.lbl_send_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSendToOne: String? = MyApp.getInstance().resources.getString(R.string.msg_add_to_benefi)
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
  var txtChange: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransferFrom: String? = MyApp.getInstance().resources.getString(R.string.lbl_transfer_from)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup1562One: String? = MyApp.getInstance().resources.getString(R.string.lbl_bc)
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
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.msg_acct_no_00112)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipien: String? =
      MyApp.getInstance().resources.getString(R.string.msg_how_much_would)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup1455: String? = MyApp.getInstance().resources.getString(R.string.lbl_n5_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup1677: String? = MyApp.getInstance().resources.getString(R.string.lbl_n10_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup1568: String? = MyApp.getInstance().resources.getString(R.string.lbl_n15_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etNCounterValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup1669Value: String? = null
)
