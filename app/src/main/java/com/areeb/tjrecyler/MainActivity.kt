package com.areeb.tjrecyler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.recyclerview)

       recyclerView.layoutManager =LinearLayoutManager(this)
        val items = fetchData()
        val adapter= RecyclerAdapter(items)
        recyclerView.adapter= adapter
    }

    private fun fetchData():ArrayList<String>{
        val list = ArrayList<String>()
        for ( i in 0 until 100 ){
            list.add("title $i")
        }
        return  list
    }
}