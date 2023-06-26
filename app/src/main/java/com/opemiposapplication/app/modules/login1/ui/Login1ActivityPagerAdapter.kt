package com.opemiposapplication.app.modules.login1.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.opemiposapplication.app.R
import com.opemiposapplication.app.appcomponents.di.MyApp
import com.opemiposapplication.app.modules.login.ui.LoginFragment
import com.opemiposapplication.app.modules.loginone.ui.LoginOneFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class Login1ActivityPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_email_address),MyApp.getInstance().resources.getString(R.string.lbl_phone_number2))

        val viewPages: List<Fragment> = listOf(LoginFragment(),LoginOneFragment())

    }
}
