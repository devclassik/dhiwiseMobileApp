package com.opemiposapplication.app.modules.splashscreen.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SplashScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHuios: String? = MyApp.getInstance().resources.getString(R.string.lbl_huiospay)

)
