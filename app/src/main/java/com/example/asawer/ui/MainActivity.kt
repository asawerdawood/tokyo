package com.example.asawer.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.asawer.R
import com.example.asawer.data.DataManager
import com.example.asawer.databinding.ActivityMainBinding
import com.example.asawer.ui.adapter.Adapter
import com.example.asawer.util.CsvParse
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {
    lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        parsCsvFile()
        setup()
    }
     fun setup() {
        parsCsvFile()


        val  adapter = Adapter(DataManager._cityList,this)
        val layoutManger= LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        binding?.parentRecycler!!.layoutManager=layoutManger
        binding?.parentRecycler!!.adapter=adapter
    }



    private fun parsCsvFile() {
        val inputStream: InputStream = assets.open("tokyo.csv")
        val buffer = BufferedReader(InputStreamReader(inputStream))
        val parser = CsvParse()
        buffer.forEachLine { it ->
            val currentPost = parser.parse(it)

            DataManager.addPost(currentPost)
        }


    }
}