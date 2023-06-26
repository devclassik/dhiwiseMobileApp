package com.opemiposapplication.app.modules.proofofidentityone.`data`.model

import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProofOfIdentityOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirtyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProofofIdenti: String? =
      MyApp.getInstance().resources.getString(R.string.msg_proof_of_identi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_upload_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBusinessLocati: String? =
      MyApp.getInstance().resources.getString(R.string.msg_business_locati)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProofofIdentiOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_proof_of_identi2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTermAndCondition: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_clicking_the3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_proof_of_person)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupElevenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupNineteenValue: String? = null
)
