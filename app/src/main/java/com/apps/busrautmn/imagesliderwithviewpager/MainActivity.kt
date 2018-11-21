package com.apps.busrautmn.imagesliderwithviewpager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.view.View
import com.apps.busrautmn.imagesliderwithviewpager.adapter.ViewPagerAdapter

class MainActivity : AppCompatActivity() {

    internal lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager = findViewById<View>(R.id.viewPager) as ViewPager

        val adapter = ViewPagerAdapter(this)
        viewPager.adapter = adapter
    }

}
