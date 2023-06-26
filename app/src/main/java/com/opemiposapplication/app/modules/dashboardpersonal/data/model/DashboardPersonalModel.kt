package com.opemiposapplication.app.modules.dashboardpersonal.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DashboardPersonalModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOWNYOURWEIRD: String? = MyApp.getInstance().resources.getString(R.string.lbl_dafe_stanley)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAcctNo001155: String? =
      MyApp.getInstance().resources.getString(R.string.msg_acct_no_001155)
  ,
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
  var txtOWNYOURWEIRDOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_quick_actions)
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
  var txtOWNYOURWEIRDTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_transactions)

)
