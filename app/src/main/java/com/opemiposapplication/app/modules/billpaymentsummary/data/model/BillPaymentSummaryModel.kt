package com.opemiposapplication.app.modules.billpaymentsummary.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BillPaymentSummaryModel(
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
      MyApp.getInstance().resources.getString(R.string.lbl_bill_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteranAccoun: String? = MyApp.getInstance().resources.getString(R.string.lbl_summary)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipien: String? = MyApp.getInstance().resources.getString(R.string.lbl_amount)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_n_5_000_002)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransferFrom: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment_for)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBRIGHTCYPH: String? = MyApp.getInstance().resources.getString(R.string.msg_betting_lotte)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZenithBankZero: String? = MyApp.getInstance().resources.getString(R.string.lbl_sportybet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChange: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransferFromOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_beneficiary)
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
  var txtZenithBankZeroOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_34902345819)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransferFromTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_account_from)
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
  var txtChangeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)

)
