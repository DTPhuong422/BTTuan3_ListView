package com.example.listview.tuan32

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.listview.R

class tuan32Adapter(context: Context, ls: ArrayList<tuan32Contact>): BaseAdapter() {
    var ls:ArrayList<tuan32Contact> = ls;
    var context: Context = context;

    // lay ve tong so item
    override fun getCount(): Int {
        return ls.size
    }
    //lay ve item hien tai
    override fun getItem(position: Int): Any {
        return ls.get(position)
    }
    //lay ve id cua item
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var c = convertView
        // 1. tao view
        //1.1 neu chua co view -> tao view moi
        var vax: ViewAX
        if( c == null)
        {
            vax = ViewAX() // tao vieww moi
            c = LayoutInflater.from(context).inflate(R.layout.tuan32_itemlview,null)
            // anh xa tung thanh phan cua layout
            vax.img_image = c.findViewById(R.id.tuan32ItemImage)
            vax.tv_name = c.findViewById( R.id.tuan32ItemName)
            vax.tv_age = c.findViewById ( R.id.tuan32ItemAge)
            c.tag = vax
        }
        else
        {
            vax = c!!.tag as ViewAX
        }
        vax.img_image!!.setImageResource(ls[position].image!!)
        vax.tv_name!!.text = ls[position].name!!
        vax.tv_age!!.text = ls[position].age!!
        return c!!
    }
    //khai bao lop anh xa
    inner class ViewAX {
        var img_image : ImageView? = null
        var tv_name : TextView? = null
        var tv_age : TextView? = null
    }

}