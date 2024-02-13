package com.example.tabsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tabs = findViewById<com.google.android.material.tabs.TabLayout>(R.id.tabs)
        val view = findViewById<androidx.viewpager.widget.ViewPager>(R.id.veiwPager)
        val fragmentAdapter = MyPagerAdapter(supportFragmentManager)
        view.adapter = fragmentAdapter
        tabs.setupWithViewPager(view)
    }
}