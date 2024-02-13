package com.example.tabsapplication

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> ImageFragment()
            1 -> ListFragment()
            2 -> TableFragment()
            else -> {
                return TableFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "Фотка"
            1 -> "Список"
            2 -> "Таблица"
            else -> {
                return "Таблица"
            }
        }
    }
}