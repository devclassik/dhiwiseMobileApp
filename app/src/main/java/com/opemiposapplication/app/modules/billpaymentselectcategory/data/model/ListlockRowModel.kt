package com.opemiposapplication.app.modules.billpaymentselectcategory.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListlockRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAirtime: String? = MyApp.getInstance().resources.getString(R.string.lbl_utilities)

)
