package com.opemiposapplication.app.modules.menutransfers.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MenuTransfersModel(
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
  var txtGroup1669: String? = MyApp.getInstance().resources.getString(R.string.msg_enter_account_n)
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
  var txtAllTransaction: String? =
      MyApp.getInstance().resources.getString(R.string.msg_beetle_taxi_inc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllTransactionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_all_transaction)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransfers: String? = MyApp.getInstance().resources.getString(R.string.lbl_transfer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAirtimeData: String? = MyApp.getInstance().resources.getString(R.string.lbl_airtime_data2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBillPayment: String? = MyApp.getInstance().resources.getString(R.string.lbl_bill_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhonePay: String? = MyApp.getInstance().resources.getString(R.string.lbl_phone_pay)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPOS: String? = MyApp.getInstance().resources.getString(R.string.lbl_pos_terminals)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDisputes: String? = MyApp.getInstance().resources.getString(R.string.lbl_support)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSettingsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSettingsTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_log_out)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVersionCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_version_1_1_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHello: String? = MyApp.getInstance().resources.getString(R.string.lbl_hello)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDafeStanley: String? = MyApp.getInstance().resources.getString(R.string.lbl_dafe_stanley)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup1669OneValue: String? = null
)
