package com.opemiposapplication.app.modules.start.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class StartModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcometoHuio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_to_huio)

)
