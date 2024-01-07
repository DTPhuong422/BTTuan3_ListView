package com.example.listview.tuan32

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.listview.R

class Tuan32MainActivity : AppCompatActivity() {
    var adap:tuan32Adapter? = null
    var ls: ArrayList<tuan32Contact> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan32_main)
        var lv = findViewById<ListView>(R.id.tuan32listview)
        ls.add(tuan32Contact("Nguyen Van Nam", "18", R.drawable.android))
        ls.add(tuan32Contact("Tran Van Linh", "20", R.drawable.reddit))
        ls.add(tuan32Contact("Do Thi Phuong", "21", R.drawable.snapchat))
        ls.add(tuan32Contact("Nguyen Mai Chau", "19", R.drawable.android))
        ls.add(tuan32Contact("Vu Minh Hoang", "18", R.drawable.snapchat))
        ls.add(tuan32Contact("Mai Thuy Linh", "22", R.drawable.reddit))
        adap = tuan32Adapter(context = this, ls)
        lv.adapter = adap

    }
}