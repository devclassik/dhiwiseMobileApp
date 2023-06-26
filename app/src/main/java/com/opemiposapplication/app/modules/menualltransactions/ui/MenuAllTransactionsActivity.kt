package com.opemiposapplication.app.modules.menualltransactions.ui

import android.view.View
import androidx.activity.viewModels
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.base.BaseActivity
import com.opemiposapplication.app.databinding.ActivityMenuAllTransactionsBinding
import com.opemiposapplication.app.modules.menualltransactions.`data`.model.ListiconsaxlinearFiveRowModel
import com.opemiposapplication.app.modules.menualltransactions.`data`.model.ListiconsaxlinearTwoRowModel
import com.opemiposapplication.app.modules.menualltransactions.`data`.model.Listmaximize4RowModel
import com.opemiposapplication.app.modules.menualltransactions.`data`.viewmodel.MenuAllTransactionsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MenuAllTransactionsActivity :
    BaseActivity<ActivityMenuAllTransactionsBinding>(R.layout.activity_menu_all_transactions) {
  private val viewModel: MenuAllTransactionsVM by viewModels<MenuAllTransactionsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listmaximizeAdapter =
    ListmaximizeAdapter(viewModel.listmaximizeList.value?:mutableListOf())
    binding.recyclerListmaximize.adapter = listmaximizeAdapter
    listmaximizeAdapter.setOnItemClickListener(
    object : ListmaximizeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listmaximize4RowModel) {
        onClickRecyclerListmaximize(view, position, item)
      }
    }
    )
    viewModel.listmaximizeList.observe(this) {
      listmaximizeAdapter.updateData(it)
    }
    val listiconsaxlinearTwoAdapter =
    ListiconsaxlinearTwoAdapter(viewModel.listiconsaxlinearTwoList.value?:mutableListOf())
    binding.recyclerListiconsaxlinearTwo.adapter = listiconsaxlinearTwoAdapter
    listiconsaxlinearTwoAdapter.setOnItemClickListener(
    object : ListiconsaxlinearTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListiconsaxlinearTwoRowModel) {
        onClickRecyclerListiconsaxlinearTwo(view, position, item)
      }
    }
    )
    viewModel.listiconsaxlinearTwoList.observe(this) {
      listiconsaxlinearTwoAdapter.updateData(it)
    }
    val listiconsaxlinearFiveAdapter =
    ListiconsaxlinearFiveAdapter(viewModel.listiconsaxlinearFiveList.value?:mutableListOf())
    binding.recyclerListiconsaxlinearFive.adapter = listiconsaxlinearFiveAdapter
    listiconsaxlinearFiveAdapter.setOnItemClickListener(
    object : ListiconsaxlinearFiveAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListiconsaxlinearFiveRowModel) {
        onClickRecyclerListiconsaxlinearFive(view, position, item)
      }
    }
    )
    viewModel.listiconsaxlinearFiveList.observe(this) {
      listiconsaxlinearFiveAdapter.updateData(it)
    }
    binding.menuAllTransactionsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListmaximize(
    view: View,
    position: Int,
    item: Listmaximize4RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListiconsaxlinearTwo(
    view: View,
    position: Int,
    item: ListiconsaxlinearTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListiconsaxlinearFive(
    view: View,
    position: Int,
    item: ListiconsaxlinearFiveRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MENU_ALL_TRANSACTIONS_ACTIVITY"

  }
}
