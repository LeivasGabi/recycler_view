package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.models.DataSource
import com.example.recyclerview.models.ProfileAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var profileAdapter: ProfileAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initAdapter()
        populateItems()
    }

    private fun populateItems() {
        val dataSource = DataSource.createDataSet()
        profileAdapter.setDataSet(dataSource)
    }

    private fun initAdapter() {
        profileAdapter = ProfileAdapter()

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerView.adapter = profileAdapter
    }
}