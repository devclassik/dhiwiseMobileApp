package com.opemiposapplication.app.modules.menudashboardone.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MenuDashboardOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAvailableBalan: String? =
      MyApp.getInstance().resources.getString(R.string.msg_available_balan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtN000: String? = MyApp.getInstance().resources.getString(R.string.lbl_n0_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLedgerBalance: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ledger_balance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOWNYOURWEIRD: String? = MyApp.getInstance().resources.getString(R.string.lbl_quick_actions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransfers: String? = MyApp.getInstance().resources.getString(R.string.lbl_transfer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAirtimeData: String? = MyApp.getInstance().resources.getString(R.string.lbl_airtime_data)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBillPayment: String? = MyApp.getInstance().resources.getString(R.string.lbl_bills)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhonePay: String? = MyApp.getInstance().resources.getString(R.string.lbl_phone_pay)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOWNYOURWEIRDOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_transactions)
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
  var txtTransfersOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_transfer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAirtimeDataOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_airtime_data2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBillPaymentOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_bill_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhonePayOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_phone_pay)
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

)
