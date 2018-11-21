package com.apps.busrautmn.imagesliderwithviewpager.adapter

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.apps.busrautmn.imagesliderwithviewpager.R
import java.net.ContentHandler
import java.security.AccessControlContext

class ViewPagerAdapter( private val context:Context):PagerAdapter() {


     private var layoutInflater:LayoutInflater?=null

     private val images = arrayOf(R.drawable.panda,R.drawable.koala,R.drawable.duck,R.drawable.leon)

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`


    }

    override fun getCount(): Int {

      return  images.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = layoutInflater!!.inflate(R.layout.custom_layout,null)
        var image = v.findViewById<View>(R.id.image_view) as ImageView
         image.setImageResource(images[position])
        val vp = container as ViewPager
        vp.addView(v,0)

        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {

        val vp = container as ViewPager
        val v = `object` as View
        vp.removeView(v)
    }

}